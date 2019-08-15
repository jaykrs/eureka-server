package com.article.articlecms.ijcr;

import javax.jcr.LoginException;
import javax.jcr.RepositoryException;
import javax.jcr.SimpleCredentials;

public interface IJcrAuthentication {

	public boolean loginRepository(String userId, String pwd) throws LoginException, RepositoryException;
	public boolean createRepository(SimpleCredentials simpleCredential ,String repositoryName);

}
