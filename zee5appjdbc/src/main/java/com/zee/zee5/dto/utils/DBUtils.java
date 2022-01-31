package com.zee.zee5.dto.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DBUtils {


	Connection connection = null;
	
	public static DBUtils dbUtils = null;
	public DBUtils() throws IOException{
		properties=this.loadProperties();
	}
	public static DBUtils getInstance() throws IOException {
		if(dbUtils==null)
			dbUtils= new DBUtils();
		return dbUtils;
	}

	public Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(properties.getProperty("jdbc.url"),
						properties.getProperty("jdbc.username"), properties.getProperty("jdbc.password"));
				connection.setAutoCommit(false);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}	
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	Properties properties=loadProperties();

	private Properties loadProperties() throws IOException
	{
		InputStream inputStream=
				DBUtils.class.getClassLoader().getResourceAsStream("application.properties");
		
		Properties properties=new Properties();
		properties.load(inputStream);
		return properties;
		
	}
	
	public static void main(String[] args) throws IOException {
		DBUtils dbUtils=DBUtils.getInstance();
		Connection connection=dbUtils.getConnection();
		dbUtils.getConnection();
	//	System.out.println(connection!=null);
	}
}
