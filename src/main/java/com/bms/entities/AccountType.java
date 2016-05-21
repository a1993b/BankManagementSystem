package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the account_type database table.
 * 
 */
@Entity
@Table(name="account_type")
@NamedQuery(name="AccountType.findAll", query="SELECT a FROM AccountType a")
public class AccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="account_id")
	private String accountId;

	@Column(name="account_value")
	private String accountValue;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="accountType")
	private List<Account> accounts;

	public AccountType() {
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountValue() {
		return this.accountValue;
	}

	public void setAccountValue(String accountValue) {
		this.accountValue = accountValue;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account addAccount(Account account) {
		getAccounts().add(account);
		account.setAccountType(this);

		return account;
	}

	public Account removeAccount(Account account) {
		getAccounts().remove(account);
		account.setAccountType(null);

		return account;
	}

}