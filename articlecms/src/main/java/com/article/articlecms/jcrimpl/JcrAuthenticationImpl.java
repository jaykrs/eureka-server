package com.article.articlecms.jcrimpl;

import javax.jcr.GuestCredentials;
import javax.jcr.LoginException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.logging.log4j.util.Strings;

import com.article.articlecms.ijcr.IJcrAuthentication;

public class JcrAuthenticationImpl implements IJcrAuthentication{

	@Override
	public boolean loginRepository(String userId, String pwd) throws LoginException, RepositoryException {
		Repository repository = JcrUtils.getRepository();
        Session session = repository.login(new GuestCredentials());
        try { 
            String user = session.getUserID(); 
            String name = repository.getDescriptor(Repository.REP_NAME_DESC); 
            if(Strings.isNotBlank(user) && Strings.isNotBlank(name))
            	return true;
        } finally { 
            session.logout(); 
        }
        return false;
	}

}
