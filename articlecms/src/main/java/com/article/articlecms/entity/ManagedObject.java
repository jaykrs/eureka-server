package com.article.articlecms.entity;

import java.util.Date;

import lombok.Data;

@Data
public abstract class ManagedObject {

	protected String GUID;
	protected Date createdDate;
	protected Date modifiedDate;
	protected String createdBy;
	protected String modifiedBy;

}
