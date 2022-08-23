package com.cts.code.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PensionerDetailEntity {
	@Id
	
	private Long adhaarNumber;
	private String name;
	private String dob;
	private String panCard;
	private Long salaryEarned;
	private Long allowances;
	private String pensionIndicator; // (self or family)
	private String bankName;
	private Long accountNumber;
	private String bankIndicator; //(private or public)

	public PensionerDetailEntity() {
		super();
	}
	
	public PensionerDetailEntity(Long adhar, String name, String dob, String panCard, Long salaryEarned, Long allowances,
			String pensionIndicator, String bankName, Long accountNumber, String bankIndicator) {
		super();
		this.adhaarNumber = adhar;
		this.name = name;
		this.dob = dob;
		this.panCard = panCard;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionIndicator = pensionIndicator;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankIndicator = bankIndicator;

	}
}
