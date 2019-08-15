package com.article.articlecms.user;

import com.article.articlecms.entity.Users;

/**
 * @author jayant
 *
 */
public interface IUserService {

	public Users createUser(String userId, String emailId, String fName, String lName, String pwd);

	public Users loginUser(String userId, String emailId, String pwd);

	public Users updateUser(Users user);

	public boolean activateUser(Users user, boolean activeInd);

	public Users findUser(String userId, String emailId);

	public Users loginCasUser(String userId, String emailId);

}
