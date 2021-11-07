package com.mudzingwa.services;

import java.util.List;

import com.mudzingwa.entities.Employee;

public interface EmployeeServiceInterf {
	public Employee saveEmployee(Employee emp);
	public List<Employee> allEmpployee();
	public Employee findById(Integer id);
	public void deleteById(Integer id);
	public Employee UpdateEmployee(Integer eid,Employee emp);
	 public List<Employee> doingIt();

}
