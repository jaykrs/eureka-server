package com.article.articlecms.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author jayant
 *
 */

@Entity
@Table(name = "Users")
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385794955661915701L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable = false)
	private int userId;
	
	@Column(name = "EMAIL_ID", nullable = false)
	private String emailId;
	@Column(name = "Last_Login_Date")
	private Date lastLoginDate;

	@Column(name = "Dob")
	private Date dob;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "INITIALS", nullable = true)
	private String initials;

	@Transient
	private String displayName;

	@Column(name = "SUPERVISOR_ID", nullable = true)
	private String supervisorId;

	@Column(name = "MO_ID", nullable = false)
	private String managementObject;

	@Transient
	private ArrayList<Users> assistants;

	// @Type(type="yes_no")
	@Column(name = "ACTIVE_IND")
	private Boolean isActive;

	public int getUserId() {
		return userId;
	}

	public Users() {
		super();
	}

	public Users(int userId, String firstName, String lastName) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Users(int userId, String firstName, String lastName, String managedObjectId) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.managementObject = managedObjectId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getManagementObject() {
		return managementObject;
	}

	public void setManagementObject(String managementObject) {
		this.managementObject = managementObject;
	}

	public ArrayList<Users> getAssistants() {
		return assistants;
	}

	public void setAssistants(ArrayList<Users> assistants) {
		this.assistants = assistants;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "USER_ROLE_ID") private UserRole userRole;
	 */
}
