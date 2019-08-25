package com.article.articlecms.Idao;

import java.util.List;

import com.article.articlecms.entity.Users;

public interface IUsersDAO {

	List<Users> getAllUsers();

    void addUser(Users user);
    void updateUsers(Users User);
    void deleteUsers(int userId);
    boolean usersExists(String emailId);
	Users getUsersById(int userId);
}
