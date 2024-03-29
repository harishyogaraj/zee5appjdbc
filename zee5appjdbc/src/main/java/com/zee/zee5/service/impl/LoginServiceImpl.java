package com.zee.zee5.service.impl;

import java.io.IOException;
import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.stereotype.Service;

import com.zee.zee5.dto.Login;
import com.zee.zee5.dto.ROLE;
import com.zee.zee5.repository.LoginRepository;
import com.zee.zee5.repository.impl.LoginRepositoryImpl;
import com.zee.zee5.service.LoginService;
import com.zee.zee5.service.UserService;

@Service
public class LoginServiceImpl implements LoginService {

	LoginRepository loginRepository=null;
	public LoginServiceImpl() throws IOException{
		// TODO Auto-generated constructor stub
		// loginRepository=LoginRepositoryImpl.getInstance();
	}
	
	
	
	@Override
	public String addCredentials(Login login) {
		// TODO Auto-generated method stub
		return loginRepository.addCredentials(login);
	}

	@Override
	public String deleteCredentials(String userName) {
		// TODO Auto-generated method stub
		return loginRepository.deleteCredentials(userName);
	}

	@Override
	public String changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		return loginRepository.changePassword(userName, password);
	}

	@Override
	public String changeRole(String userName, ROLE role) {
		// TODO Auto-generated method stub
		return loginRepository.changeRole(userName, role);
	}

		
	

	

	}
