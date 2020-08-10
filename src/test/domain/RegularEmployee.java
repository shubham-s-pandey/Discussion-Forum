package com.tcet.tc_spring.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regularEmployee")
@PrimaryKeyJoinColumn(name = "id")
public class RegularEmployee extends Employee{
	
	private String salary;
	private String bonus;
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	
}
