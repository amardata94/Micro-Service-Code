package com.amarnath.rentcloud.rencloud_commons.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	 @Column(name = "name")
	private String name;
	 @Column(name = "salary")
	private int salary;
	 @Column(name = "address")
	private String address;
	
	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "created_at", nullable = false, updatable = false)
	 * 
	 * @CreatedDate private Date createdAt;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "updated_at", nullable = false)
	 * 
	 * @LastModifiedDate private Date updatedAt;
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	/*
	 * public Date getCreatedAt() { return createdAt; }
	 * 
	 * public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
	 * 
	 * public Date getUpdatedAt() { return updatedAt; }
	 * 
	 * public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
	 */
    
    
}
