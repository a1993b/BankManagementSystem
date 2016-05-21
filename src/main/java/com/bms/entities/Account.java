package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="account_number")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="account_start_date")
	private Date accountStartDate;

	@Column(name="available_balance")
	private String availableBalance;

	//bi-directional many-to-one association to CustomerDetail
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerDetail customerDetail;

	//bi-directional many-to-one association to AccountType
	@ManyToOne
	@JoinColumn(name="account_id")
	private AccountType accountType;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="branch_id")
	private Branch branch;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="account")
	private List<Transaction> transactions;

	public Account() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getAccountStartDate() {
		return this.accountStartDate;
	}

	public void setAccountStartDate(Date accountStartDate) {
		this.accountStartDate = accountStartDate;
	}

	public String getAvailableBalance() {
		return this.availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public CustomerDetail getCustomerDetail() {
		return this.customerDetail;
	}

	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}

	public AccountType getAccountType() {
		return this.accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setAccount(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setAccount(null);

		return transaction;
	}

}