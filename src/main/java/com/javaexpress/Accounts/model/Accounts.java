package com.javaexpress.Accounts.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNumber;
	private int customerId;
	private String accountType;
	private String branchAddress;
	private LocalDate createDt;
}
