package com.app.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserdao;
import com.app.pojos.User;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserdao dao;
	
	@Override
	public User validateUser(String email, String pass) {
		// TODO Auto-generated method stub
		return dao.validateUser(email, pass);
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return dao.getUser(email);
	}

	@Override
	public void register(User u) {
		// TODO Auto-generated method stub
		dao.register(u);
	}

	@Override
	public void updatePassword(String email, String newPass) {
		// TODO Auto-generated method stub
		dao.updatePassword(email, newPass);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		dao.updateUser(u);
	}

	@Override
	public void updatePhone(String email, long newphone) {
		// TODO Auto-generated method stub
		dao.updatePhone(email, newphone);
	}

}
