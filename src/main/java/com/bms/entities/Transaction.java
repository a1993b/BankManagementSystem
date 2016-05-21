package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transaction database table.
 * 
 */
@Entity
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="amount_deducted")
	private String amountDeducted;

	@Column(name="available_balance")
	private String availableBalance;

	@Column(name="benef_acc_no")
	private String benefAccNo;

	@Column(name="current_balance")
	private String currentBalance;

	@Column(name="operation_type")
	private String operationType;

	//bi-directional many-to-one association to CustomerDetail
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerDetail customerDetail;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="account_number")
	private Account account;

	//bi-directional many-to-one association to Beneficiary
	@ManyToOne
	@JoinColumn(name="beneficiary_id")
	private Beneficiary beneficiary;

	public Transaction() {
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAmountDeducted() {
		return this.amountDeducted;
	}

	public void setAmountDeducted(String amountDeducted) {
		this.amountDeducted = amountDeducted;
	}

	public String getAvailableBalance() {
		return this.availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getBenefAccNo() {
		return this.benefAccNo;
	}

	public void setBenefAccNo(String benefAccNo) {
		this.benefAccNo = benefAccNo;
	}

	public String getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public CustomerDetail getCustomerDetail() {
		return this.customerDetail;
	}

	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Beneficiary getBeneficiary() {
		return this.beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

}