package com.zee.zee5app;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import com.zee.zee5.dto.Login;
import com.zee.zee5.dto.Movie;
import com.zee.zee5.dto.ROLE;
import com.zee.zee5.dto.Register;
import com.zee.zee5.dto.Series;
import com.zee.zee5.dto.Subscription;
import com.zee.zee5.exeption.IdNotFound;
import com.zee.zee5.exeption.InvalidIdLengthException;
import com.zee.zee5.exeption.InvalidNameException;
import com.zee.zee5.repository.impl.MovieRepositoryImpl;
import com.zee.zee5.repository.impl.SeriesRepositoryImpl;
import com.zee.zee5.service.LoginService;
import com.zee.zee5.service.MovieService;
import com.zee.zee5.service.SeriesService;
import com.zee.zee5.service.SubscriptionService;
import com.zee.zee5.service.UserService;
import com.zee.zee5.service.impl.LoginServiceImpl;
import com.zee.zee5.service.impl.MovieServiceImpl;
import com.zee.zee5.service.impl.SeriesServiceImpl;
import com.zee.zee5.service.impl.SubscriptionServiceImpl;
import com.zee.zee5.service.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			UserService service = null;
			Register register =new Register();
			register.setContactNumber(new BigDecimal("9998887776"));
			String id="harish10";
			System.out.println(service.updateUser(id, register));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail");
		}
		
		
		
//		try {
//			LoginService loginservice = LoginServiceImpl.getInstance();
//			System.out.println(loginservice.changeRole("pavan2@gmail.com",ROLE.ROLE_ADMIN));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
				
		
	
		
//	UserService service ;
//	try {
//		service=UserServiceImpl.getInstance();
//
//			Optional<List<Register>> optional=service.getAllRegisters();
//			if(optional.isEmpty())
//			{
//				System.out.println("there is no records");
//			}
//			else
//			{
//				optional.get().forEach(e->System.out.println(e));
//			}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InvalidIdLengthException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InvalidNameException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		
//	
//	System.out.println();
//	
//	try {
//		service=UserServiceImpl.getInstance();
//		try {
//			String result=service.deleteUserById("harish31");
//			System.out.println(result);
//		} catch (IdNotFound | InvalidNameException | InvalidIdLengthException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//	System.out.println();
//		
//	try {
//		service=UserServiceImpl.getInstance();
//		Register[] optional;
//		try {
//			optional = service.getAllUsers();
//			for (Register register : optional) {
//				System.out.println(register);
//			}
//		} catch (InvalidIdLengthException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidNameException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//		
//
//		try {
//			Register register = new Register("pavan2", "harish", "y", "pavan2@gmail.com","12345678");
//			
//			register.setContactNumber(new BigDecimal("9975477764"));
//			
//			service = UserServiceImpl.getInstance();
//			
//			String result = service.addUser(register);
//			System.out.println(result);
//			
//		} catch (InvalidIdLengthException | InvalidNameException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			UserService service = UserServiceImpl.getInstance();
//			Optional<Register> register = service.getUserById("harish1");
//			System.out.println(register.get());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IdNotFound e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidIdLengthException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvalidNameException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		

		
		
//----------------------------------------------//		
		
//		try {
//			UserService service=UserServiceImpl.getInstance();
//			Optional<Register> register=service.getUserById("harish1");
//			System.out.println(register.get());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}

/*
public class Main {

	public static void main(String[] args) throws InvalidNameException, InvalidIdLengthException {
	
		Register register=new Register("harish1","harish","y","hari@","1235566");
		register.setContactNumber(new BigDecimal("9742639958"));
		UserService userService=UserServiceImpl.getInstance();
		String result=userService.addUser(register);
		System.out.println(result);
		
		
*/	
		
		// TODO Auto-generated method stub
/*
		Register register=new Register();
		
		Register register3 =new Register("h110000","mahesh","V","mahi@","mahi");
		
		try {
			register.setFirstName("Harish");
		} catch (InvalidNameException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		register.setLastName("Y");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			register.setemail("Harish@");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			register.setId("H1100000");
		} catch (InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			register.setpassword("H1100000");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(register.toString());
		System.out.println(register.getEmail());
		Login login =new Login();
		UserService service = UserServiceImpl.getInstance();
		
		for(int i=1;i<=20;i++)
		{
			Register register2=new Register();
			try {
				register2.setId("aa000000"+i);
			} catch (InvalidIdLengthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				register2.setFirstName("har"+i);
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				register2.setLastName("Y"+i);
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				register2.setemail("har@133"+i);
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				register2.setpassword("har@133"+i);
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			String result=service.addUser(register2);
			System.out.println(result);
			System.out.println(i);
		}
		
//		Register register2=service.getUserById("aa1");
//		System.out.println(register2!=null);
		
//		System.out.println(service.getUserById("aa0000005"));
		
		Optional<Register> optional;
		try {
			optional = service.getUserById("aa0000003");
		} catch (IdNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.getAllRegisters().forEach(e->System.out.println(e));
*/
	//---------------------------------------------------//	
/*
		MovieService m_service=MovieServiceImpl.getInstance();
		
		
		for(int i=0;i<5;i++)
		{
			Movie movie=new Movie();
			movie.setId(""+i);
			movie.setLanguage("Kannada");
			movie.setMovieName("movie"+i);
			String result1=m_service.addMovie(movie);
		
			System.out.println(result1);
		}
		
		HashSet<Movie> movies=m_service.getAllMovies();
		for(Movie m: movies)
		{
			System.out.println(m);
		}
		
		
		System.out.println(m_service.getAllMovies());
		
		System.out.println();
		
		try {
			System.out.println(m_service.getMovieById("4"));
		} catch (IdNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
  //----------------------------------------------------//
		SeriesService s_service=SeriesServiceImpl.getInstance();
		
		for(int i=0;i<5;i++)
		{
			Series series=new Series();
			series.setId(""+i);
			series.setLanguage("English");
			series.setSeriesName("series"+i);
			String result1=s_service.addSeries(series);
		
			System.out.println(result1);
		}
		
  //------------------------------------------------------//
		SubscriptionService sub_service=SubscriptionServiceImpl.getInstance();
		
		
		for(int i=0;i<5;i++)
		{
			Subscription subscriptions=new Subscription();
			subscriptions.setId(""+i);
			subscriptions.setAutoRenewal(true);
			subscriptions.setPaymentMode("online");
			String result1=sub_service.addSubscription(subscriptions);
			System.out.println(result1);
		}

		*/

		