package com.zee.zee5app;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.zee.zee5.config.Config;
import com.zee.zee5.dto.Register;
import com.zee.zee5.exeption.InvalidIdLengthException;
import com.zee.zee5.exeption.InvalidNameException;
import com.zee.zee5.repository.UserRepository;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		UserRepository userRepository=applicationContext.getBean(UserRepository.class);
		System.out.println(userRepository);
		
		UserRepository userRepository2=applicationContext.getBean(UserRepository.class);
		System.out.println(userRepository2);
		
		System.out.println(userRepository.hashCode());
		System.out.println(userRepository.hashCode());
		System.out.println(userRepository.equals(userRepository2));

		DataSource dataSource=applicationContext.getBean("dataSource",DataSource.class);
		System.out.println(dataSource!=null);
		
		
		Register register;
		try {
			register = new Register("pavan13", "harish", "y", "pavan36@gmail.com","12345678");
			System.out.println(userRepository.addUser(register));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		applicationContext.close();
	}

}
