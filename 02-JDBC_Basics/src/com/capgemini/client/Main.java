package com.capgemini.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static Connection createConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password = "pass";
		Connection connection = DriverManager.getConnection(dbURL, userName, password);
		return connection;
		}
	
	public static void insertRecord() throws SQLException, ClassNotFoundException{
		Connection connection = createConnection();
		System.out.println("Connection Successfull....");
		String SQL = "insert into Customer values(5,'Kalyan Traders','Mumbai',7500.00)";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r+" rows inserted");
		statement.close();
		connection.close();
	}
	
	public static void updateRecord() throws SQLException, ClassNotFoundException{
		Connection connection = createConnection();
		System.out.println("Connection Successfull....");
		String SQL = "update Customer set c_id = 1 where c_name = 'Kiran Traders'";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r+" rows updated");
		statement.close();
		connection.close();
	}
	public static void deleteRecord() throws SQLException, ClassNotFoundException{
		Connection connection = createConnection();
		System.out.println("Connection Successfull....");
		String SQL = "delete from Customer where c_id = 1";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r+" rows deleted");
		statement.close();
		connection.close();
	}
	public static void displayAllRecords() throws ClassNotFoundException, SQLException{
		Connection connection  = createConnection();
		System.out.println("Connection Successfull....");
		String SQL = "select * from customer";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		while(rs.next()){
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t\t");
		System.out.println(rs.getDouble(4));
		}
		rs.close();
		statement.close();
		connection.close();
	}
	public static void displayOneRecord(int id) throws ClassNotFoundException, SQLException{
		Connection connection  = createConnection();
		System.out.println("Connection Successfull....");
		String SQL = "select * from customer where c_id = "+id;
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		if(rs.next()){
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.println(rs.getDouble(4));
		}
		rs.close();
		statement.close();
		connection.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		displayOneRecord(3);
	}
}
