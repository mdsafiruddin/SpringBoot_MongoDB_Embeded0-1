package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String eid;
	 private Integer empId;
	 private String empName;
	 private Double empSal;
	 
	 
	 public Employee() {
		System.out.println("employee object");
	 }


	public Employee(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	 
	 
	 
}
