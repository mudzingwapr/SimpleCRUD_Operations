package com.mudzingwa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudzingwa.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
