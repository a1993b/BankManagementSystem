package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the beneficiary database table.
 * 
 */
@Entity
@NamedQuery(name="Beneficiary.findAll", query="SELECT b FROM Beneficiary b")
public class Beneficiary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="beneficiary_id")
	private String beneficiaryId;

	@Column(name="benef_acc_no")
	private String benefAccNo;

	@Column(name="benef_acc_type")
	private String benefAccType;

	@Column(name="benef_email_id")
	private String benefEmailId;

	@Column(name="benef_ifsc_code")
	private String benefIfscCode;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="beneficiary")
	private List<Transaction> transactions;

	public Beneficiary() {
	}

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBenefAccNo() {
		return this.benefAccNo;
	}

	public void setBenefAccNo(String benefAccNo) {
		this.benefAccNo = benefAccNo;
	}

	public String getBenefAccType() {
		return this.benefAccType;
	}

	public void setBenefAccType(String benefAccType) {
		this.benefAccType = benefAccType;
	}

	public String getBenefEmailId() {
		return this.benefEmailId;
	}

	public void setBenefEmailId(String benefEmailId) {
		this.benefEmailId = benefEmailId;
	}

	public String getBenefIfscCode() {
		return this.benefIfscCode;
	}

	public void setBenefIfscCode(String benefIfscCode) {
		this.benefIfscCode = benefIfscCode;
	}

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setBeneficiary(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setBeneficiary(null);

		return transaction;
	}

}