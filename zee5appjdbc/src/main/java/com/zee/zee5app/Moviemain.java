package com.zee.zee5app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zee.zee5.dto.Movie;
import com.zee.zee5.dto.Series;
import com.zee.zee5.dto.Subscription;
import com.zee.zee5.exeption.IdNotFound;
import com.zee.zee5.exeption.InvalidAmountException;
import com.zee.zee5.exeption.InvalidIdLengthException;
import com.zee.zee5.exeption.InvalidNameException;
import com.zee.zee5.repository.impl.SeriesRepositoryImpl;
import com.zee.zee5.service.MovieService;
import com.zee.zee5.service.SeriesService;
import com.zee.zee5.service.SubscriptionService;
import com.zee.zee5.service.impl.MovieServiceImpl;
import com.zee.zee5.service.impl.SeriesServiceImpl;
import com.zee.zee5.service.impl.SubscriptionServiceImpl;

public class Moviemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeriesService seriesService;
		
		
//		try {
//		seriesService=SeriesServiceImpl.getInstance();
//
//		Optional<Series> optional=seriesService.getSeriesById("2");
//		System.out.println(optional.get());
//			} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println("fail");
//	}
		
//			try {
//				seriesService=SeriesServiceImpl.getInstance();
//				Series series;
//				try {
//					series = new Series("series8","Kannada","7","2022-05-21","7","MM,NN","thriller","576576","20");
//					System.out.println(seriesService.addSeries(series));
//
//				} catch (InvalidIdLengthException | InvalidNameException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
						
	
	
//	try {
//		seriesService=SeriesServiceImpl.getInstance();
//
//		Optional<List<Series>> optional=seriesService.getAllSeries();
//		if(optional.isEmpty())
//		{
//			System.out.println("No records");
//		}
//		else
//		{
//			optional.get().forEach(e->System.out.println(e));
//
//		}
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println("fail");
//	}
	
	
//	try {
//		try {
//			seriesService=SeriesServiceImpl.getInstance();
//			System.out.println(seriesService.deleteSeriesById("7"));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} catch (IdNotFound e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		System.out.println("Id not found");
//	}
	
//	try {
//		seriesService = SeriesServiceImpl.getInstance();
//		Series series=new Series();
//		series.setReleasedate("2022-06-20");
//		System.out.println(seriesService.updateSeries("5", series));
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		
		
		
//		try {
//			SubscriptionService subscriptionService=SubscriptionServiceImpl.getInstance();
//			Subscription subscription=new Subscription();
//			try {
//				subscription.setAmount(1000);
//			} catch (InvalidAmountException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			subscription.setAutoRenewal("yes");
//			subscription.setDateofPurchase("12-01-2022");
//			subscription.setExpiryDate("12-06-2022");
//			
//			subscription.setPaymentMode("UPI");
//			subscription.setStatus("active");
//			subscription.setSubscriptionid("6");
//			subscription.setType("quaterly");
//			try {
//				subscription.setregId("ghouse");
//			} catch (InvalidIdLengthException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(subscriptionService.addSubscription(subscription));	
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			SubscriptionService subscriptionService=SubscriptionServiceImpl.getInstance();
//			Optional<ArrayList<Subscription>> optional=subscriptionService.getAllSubscription();
//			if(optional.isEmpty())
//			{
//				System.out.println("No records");
//			}
//			else
//			{
//				optional.get().forEach(e->System.out.println(e));
//
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		
//		
//			try {
//				SubscriptionService subscriptionService=SubscriptionServiceImpl.getInstance();
//				System.out.println(subscriptionService.deleteSubscription("5"));
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//			try {
//			SubscriptionService subscriptionService=SubscriptionServiceImpl.getInstance();
//			Subscription subscription=new Subscription();
//			subscription.setAutoRenewal("true");
//			System.out.println(subscriptionService.updateSubscription("2", subscription));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		MovieService movieService;
//			try {
//				try {
//					movieService=MovieServiceImpl.getInstance();
//					Movie movie=new Movie("7","movie7","7","MM,NN","thriller","57657676","youtube url","2022-05-21","Kannada");
//					System.out.println(movieService.addMovie(movie));
//
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//							} catch (InvalidIdLengthException | InvalidNameException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		
//		try {
//			movieService=MovieServiceImpl.getInstance();
//
//			Optional<List<Movie>> optional=movieService.getAllMovies();
//			if(optional.isEmpty())
//			{
//				System.out.println("No records");
//			}
//			else
//			{
//				optional.get().forEach(e->System.out.println(e));
//
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("fail");
//		}
//		
//		
//		try {
//			try {
//				movieService=MovieServiceImpl.getInstance();
//				System.out.println(movieService.deleteMovieById("7"));
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (IdNotFound e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Id not found");
//		}
//		
//		try {
//			movieService = MovieServiceImpl.getInstance();
//			Movie movie=new Movie();
//			movie.setReleasedate("2022-06-20");
//			System.out.println(movieService.updateMovie("6", movie));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
