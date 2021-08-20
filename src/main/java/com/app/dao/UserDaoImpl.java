package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class UserDaoImpl implements IUserdao {

	@PersistenceContext
	private EntityManager mgr;
	
	@Override
	public User validateUser(String email, String pass) {
		String jpql = "Select u from User where u.email=:email and u.password=:pass";
		return mgr.createQuery(jpql, User.class).setParameter("email", email).setParameter("pass" , pass).getSingleResult();
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassword(String email, String newPass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePhone(String email, long newphone) {
		// TODO Auto-generated method stub

	}

}
