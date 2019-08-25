package com.article.articlecms.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.article.articlecms.Idao.IUsersDAO;
import com.article.articlecms.entity.Users;

@Transactional
@Repository
public class UsersDAOImpl implements IUsersDAO {

	@PersistenceContext	
	private EntityManager entityManager;	
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUsersById(int userId) {
		return this.entityManager.find(Users.class, userId);
	}

	@Override
	public void addUser(Users user) {
		entityManager.persist(user);

	}

	@Override
	public void updateUsers(Users user) {
		

	}

	@Override
	public void deleteUsers(int userId) {
		entityManager.remove(getUsersById(userId));

	}

	@Override
	public boolean usersExists(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}


}
