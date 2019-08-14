package com.article.articlecms.ijcr;

import javax.jcr.LoginException;
import javax.jcr.RepositoryException;

public interface IJcrAuthentication {

	public boolean loginRepository(String userId, String pwd) throws LoginException, RepositoryException;
	
}
