package com.article.articlecms.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

@Data
public class Users extends ManagedObject {

	@Id
	@Column(name="USER_ID" ,nullable=false)
	private String userId;
	@Id
	@Column(name="EMAIL_ID" ,nullable=false)
	private String emailId;
	@Column(name="Last_Login_Date")
	private Date lastLoginDate;
	
	@Column(name="FIRST_NAME",nullable=false)
	private String firstName;

	
	@Column(name="LAST_NAME",nullable=false)
	private String lastName;
	
	@Column(name="INITIALS",nullable=true)
	private String initials;
	
	@Transient
	private String displayName;
	
	@Column(name="SUPERVISOR_ID",nullable=true)
	private String supervisorId;
	
	@Transient
	private ArrayList<Users> assistants;
	
		//@Type(type="yes_no")
		@Column(name="ACTIVE_IND")
		private Boolean isActive;
		
		@OneToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="USER_ROLE_ID")
		private UserRole userRole;	
}
