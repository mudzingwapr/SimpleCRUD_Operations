package com.mudzingwa.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mudzingwa.entities.Employee;
import com.mudzingwa.services.EmployeeServiceInterf;

@RestController
public class EmployeeController {
	
	
	private EmployeeServiceInterf service;
    @Autowired
	public EmployeeController(EmployeeServiceInterf service) {
		
		this.service = service;
	}
    @PostMapping("/saveEmployee")
	 public Employee saveEmplo(@RequestBody Employee emp) {
		return service.saveEmployee(emp);
	 }
	 @GetMapping("/findAll")
	 public List<Employee> findAll(){
		return service.allEmpployee(); 
	 }
	 @GetMapping("/findOne/{id}")
	 public Employee findEmploy(@PathVariable Integer id) {
		 return service.findById(id);
	 }
	 @DeleteMapping("/dele/{id}")
	  public void delete(@PathVariable Integer id) {
		  service.deleteById(id);
	  }
	 @GetMapping("ITPeople/all")
	 public List<Employee> findIt() {
		 return service.doingIt();
		  
	 }

}
