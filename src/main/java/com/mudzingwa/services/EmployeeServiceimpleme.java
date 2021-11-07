package com.mudzingwa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.entities.Employee;
import com.mudzingwa.repositories.EmployeeRepository;
@Service
public class EmployeeServiceimpleme implements EmployeeServiceInterf {
	private EmployeeRepository repository;
	@Autowired 
	public EmployeeServiceimpleme(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		
		return  repository.save(emp);
	}

	@Override
	public List<Employee> allEmpployee() {
		
		return repository.findAll();
	}

	@Override
	public Employee findById(Integer id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public Employee UpdateEmployee(Integer id,Employee emp) {
		
		return repository.save(emp);
	}
	public List<Employee> doingIt(){
		return allEmpployee().stream()
		.filter(emp->emp.getDepartments().contains("IT"))
		.collect(Collectors.toList());
		
		
	}

}
