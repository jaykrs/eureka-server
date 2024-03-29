package com.article.articlecms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author jayant
 *
 */
public class UserAccess extends ManagedObject {

	@Id
	@Column(name = "USER_ACCESS_ID", nullable = false)
	private String UserRoleId;

	@Id
	@Column(name = "USER_ID", nullable = false)
	private String userId;

	@Id
	@Column(name = "USER_PWD", nullable = false)
	private String userPwd;
}
