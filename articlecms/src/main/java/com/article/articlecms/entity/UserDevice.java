package com.article.articlecms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author jayant
 *
 */
public class UserDevice extends ManagedObject {

	@Id
	@Column(name = "USER_DEVICE_ID", nullable = false)
	private String UserDeviceId;

	@Id
	@Column(name = "USER_ID", nullable = false)
	private String UserId;

	@Id
	@Column(name = "USER_DEVICE_NAME", nullable = false)
	private String UserDeviceName;

	@Id
	@Column(name = "USER_DEVICE_TOKEN", nullable = false)
	private String UserDeviceToken;
}
