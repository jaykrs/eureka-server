package com.article.articlecms.index;

import java.util.List;

import com.article.articlecms.entity.ManagedObject;

/**
 * @author jayant
 *
 */
public interface IArticleIndex {

	public boolean createIndex(ManagedObject managedObject);

	public List<ManagedObject> retrieveFromIndex(String Keyword);

	public List<ManagedObject> retrieveFromIndex(String Keyword, ManagedObject managedObject);
}
