package com.bms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the customer_details database table.
 * 
 */
@Entity
@Table(name="customer_details")
@NamedQuery(name="CustomerDetail.findAll", query="SELECT c FROM CustomerDetail c")
public class CustomerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	private String customerId;

	private String age;

	@Column(name="alternate_number")
	private String alternateNumber;

	@Column(name="current_address_line1")
	private String currentAddressLine1;

	@Column(name="current_address_line2")
	private String currentAddressLine2;

	@Column(name="current_city")
	private String currentCity;

	@Column(name="current_country")
	private String currentCountry;

	@Column(name="current_state")
	private String currentState;

	private String current_zipCode;

	@Column(name="customer_password")
	private String customerPassword;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="father_name")
	private String fatherName;

	@Column(name="first_name")
	private String firstName;

	private String gender;
	
	private String status;
	
	@Column(name="attempt_count")
	private int attemptCount;

	@Column(name="reference_value")
	private String referenceValue;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private String mobileNumber;

	private String nationality;

	@Column(name="pan_number")
	private String panNumber;

	@Column(name="permanent_address_line1")
	private String permanentAddressLine1;

	@Column(name="permanent_address_line2")
	private String permanentAddressLine2;

	@Column(name="permanent_city")
	private String permanentCity;

	@Column(name="permanent_country")
	private String permanentCountry;

	@Column(name="permanent_state")
	private String permanentState;

	private String permanent_zipCode;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="customerDetail")
	private List<Account> accounts;

	public CustomerDetail() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAttemptCount() {
		return attemptCount;
	}

	public void setAttemptCount(int attemptCount) {
		this.attemptCount = attemptCount;
	}

	public String getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAlternateNumber() {
		return this.alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getCurrentAddressLine1() {
		return this.currentAddressLine1;
	}

	public void setCurrentAddressLine1(String currentAddressLine1) {
		this.currentAddressLine1 = currentAddressLine1;
	}

	public String getCurrentAddressLine2() {
		return this.currentAddressLine2;
	}

	public void setCurrentAddressLine2(String currentAddressLine2) {
		this.currentAddressLine2 = currentAddressLine2;
	}

	public String getCurrentCity() {
		return this.currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCurrentCountry() {
		return this.currentCountry;
	}

	public void setCurrentCountry(String currentCountry) {
		this.currentCountry = currentCountry;
	}

	public String getCurrentState() {
		return this.currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public String getCurrent_zipCode() {
		return this.current_zipCode;
	}

	public void setCurrent_zipCode(String current_zipCode) {
		this.current_zipCode = current_zipCode;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPanNumber() {
		return this.panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPermanentAddressLine1() {
		return this.permanentAddressLine1;
	}

	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}

	public String getPermanentAddressLine2() {
		return this.permanentAddressLine2;
	}

	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}

	public String getPermanentCity() {
		return this.permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public String getPermanentCountry() {
		return this.permanentCountry;
	}

	public void setPermanentCountry(String permanentCountry) {
		this.permanentCountry = permanentCountry;
	}

	public String getPermanentState() {
		return this.permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanent_zipCode() {
		return this.permanent_zipCode;
	}

	public void setPermanent_zipCode(String permanent_zipCode) {
		this.permanent_zipCode = permanent_zipCode;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Account addAccount(Account account) {
		getAccounts().add(account);
		account.setCustomerDetail(this);

		return account;
	}

	public Account removeAccount(Account account) {
		getAccounts().remove(account);
		account.setCustomerDetail(null);

		return account;
	}


}