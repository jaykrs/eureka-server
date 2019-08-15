package com.article.articlecms.transformer;

import com.article.articlecms.entity.ManagedObject;

/**
 * @author jayant
 *
 */
public interface IArticleTransformer {

	public Object transformBusinessObject(ManagedObject managedObject);

	public ManagedObject transformManagedObject(Object object);
}
