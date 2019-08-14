package com.article.articlecms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class AppModule extends ManagedObject {

	@Id
	@Column(name="APP_ID" ,nullable=false)
	private String AppModuleId;
	
	@Id
	@Column(name="APP_NAME" ,nullable=false)
	private String AppName;
}
