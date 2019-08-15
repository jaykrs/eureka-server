package com.article.articlecms.jcrimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.jcr.AccessDeniedException;
import javax.jcr.GuestCredentials;
import javax.jcr.LoginException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.UnsupportedRepositoryOperationException;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.logging.log4j.util.Strings;

import com.article.articlecms.ijcr.IJcrAuthentication;

public class JcrAuthenticationImpl implements IJcrAuthentication{

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

	public static void main(String s[]) throws LoginException, RepositoryException {
		System.out.println(new JcrAuthenticationImpl().loginRepository("", ""));
		System.out.println("repository "+new JcrAuthenticationImpl().createRepository("products"));
	}
	@Override
	public boolean createRepository(String repositoryName) {
		// TODO Auto-generated method stub
		 Repository repo = null  ;
		 Session session = null;
		try {
			 repo = JcrUtils.getRepository();
			session = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		} catch (LoginException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (RepositoryException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 try {
			 repo.login(new SimpleCredentials("admin", "admin".toCharArray()), repositoryName);
		} catch (RepositoryException e) {
			try {
				session.getWorkspace().createWorkspace(repositoryName);
			} catch (AccessDeniedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedRepositoryOperationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (RepositoryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		 
		
		 
		return true;
	}

}
