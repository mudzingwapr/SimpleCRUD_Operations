package com.mudzingwa.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="worker")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eid")
	private Integer eid;
	
	@Column(name="college")
	public static String college;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="salary")
	private Double salary;
	
	@ElementCollection
	@CollectionTable(name="departtab",joinColumns=@JoinColumn(name="eid"))
	@Column(name="department")
	private List<String> departments = new ArrayList<>();

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Employee.college = college;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", sname=" + sname + ", salary=" + salary
				+ ", departments=" + departments + "]\n";
	}
	

	public Employee() {
		super();
	}

	public Employee(Integer eid, String fname, String sname, Double salary, List<String> departments) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.sname = sname;
		this.salary = salary;
		this.departments = departments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departments, eid, fname, salary, sname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(departments, other.departments) && Objects.equals(eid, other.eid)
				&& Objects.equals(fname, other.fname) && Objects.equals(salary, other.salary)
				&& Objects.equals(sname, other.sname);
	}
	

}
