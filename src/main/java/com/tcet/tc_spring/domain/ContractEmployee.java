package com.tcet.tc_spring.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contractEmployee")
@PrimaryKeyJoinColumn(name = "id")
public class ContractEmployee extends Employee{
	
	private String payPerHour;
	private String contractDuration;
	
	public String getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(String payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	
}
