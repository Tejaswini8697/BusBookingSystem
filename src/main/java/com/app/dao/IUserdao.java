package com.app.dao;

import com.app.pojos.User;

public interface IUserdao {
	
public User validateUser(String email, String pass);
	
	public User getUser(String email);
	
	public void register (User u);
	
	public void updatePassword(String email, String newPass);
	
	public void updateUser(User u);
	
	public void updatePhone(String email, long newphone);
	

}
