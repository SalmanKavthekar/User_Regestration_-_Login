package com.becoder.service;

import com.becoder.entity.User;

public interface UserService {

	public User saveUser(User user, String ur);

	public void removeSessionMessage();
	
	public void sendEmail(User user, String path);
	
	public boolean verfyAccount(String verificationCode); 

}
