package com.article.articlecms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserRole extends ManagedObject {

	@Id
	@Column(name="USER_ROLE_ID" ,nullable=false)
	private String UserRoleId;
	
	@Id
	@Column(name="USER_ROLE_NAME" ,nullable=false)
	private String UserRoleName;
}
