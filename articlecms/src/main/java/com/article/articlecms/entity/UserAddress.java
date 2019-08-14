package com.article.articlecms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserAddress extends ManagedObject {

	@Id
	@Column(name="USER_ADDRESS_ID" ,nullable=false)
	private String UserAddressId;
	
	@Id
	@Column(name="USER_ID" ,nullable=false)
	private String UserId;
}
