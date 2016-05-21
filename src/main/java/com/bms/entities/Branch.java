package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the branch database table.
 * 
 */
@Entity
@NamedQuery(name="Branch.findAll", query="SELECT b FROM Branch b")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="branch_id")
	private String branchId;

	@Column(name="branch_address")
	private String branchAddress;

	@Column(name="branch_contact")
	private String branchContact;

	@Column(name="branch_name")
	private String branchName;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="branch")
	private List<Account> accounts;

	public Branch() {
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchAddress() {
		return this.branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchContact() {
		return this.branchContact;
	}

	public void setBranchContact(String branchContact) {
		this.branchContact = branchContact;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account addAccount(Account account) {
		getAccounts().add(account);
		account.setBranch(this);

		return account;
	}

	public Account removeAccount(Account account) {
		getAccounts().remove(account);
		account.setBranch(null);

		return account;
	}

}