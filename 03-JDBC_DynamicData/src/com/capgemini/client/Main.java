package com.capgemini.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
		String SQL = "insert into Customer values(?,?,?,?)";
		int inp_id = 0;
		String inp_name = "";
		String inp_city = "";
		double inp_amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter id : ");
		inp_id = scanner.nextInt();
		System.out.print("Enter name : ");
		inp_name = scanner.next();
		System.out.print("Enter city : ");
		inp_city = scanner.next();
		System.out.print("Enter outstanding amount : ");
		inp_amt = scanner.nextDouble();
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(1,inp_id);
		statement.setString(2,inp_name);
		statement.setString(3,inp_city);
		statement.setDouble(4,inp_amt);
		int r = statement.executeUpdate();
		System.out.println(r+" rows inserted");
		statement.close();
		connection.close();
		scanner.close();
	}
	
	public static void updateRecord() throws SQLException, ClassNotFoundException{
		Connection connection = createConnection();
		System.out.println("Connection Successfull....");
		int inp_id = 0;
		String inp_city = "";
		Scanner scanner = new Scanner(System.in);
		String SQL = "update Customer set c_city = ? where c_id = ?";
		
		System.out.print("Enter id : ");
		inp_id = scanner.nextInt();
		System.out.print("Enter city : ");
		inp_city = scanner.next();
		
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(2,inp_id);
		statement.setString(1,inp_city);
		int r = statement.executeUpdate();
		System.out.println(r+" rows updated");
		
		statement.close();
		connection.close();
		scanner.close();
	}
	public static void deleteRecord() throws SQLException, ClassNotFoundException{
		Connection connection = createConnection();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Connection Successfull....");
		int inp_id = 0;
		String SQL = "delete from Customer where c_id = ?";
		System.out.print("Enter id to delete : ");
		inp_id = scanner.nextInt();
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(1,inp_id);
		int r = statement.executeUpdate();
		System.out.println(r+" rows deleted");
		statement.close();
		connection.close();
		scanner.close();
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
		int inp_id = 0;
		Scanner scanner = new Scanner(System.in);
		String SQL = "select * from customer where c_id = ?";
		System.out.print("Enter id to display : ");
		inp_id = scanner.nextInt();
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(1,inp_id);
		ResultSet rs = statement.executeQuery();
		if(rs.next()){
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.println(rs.getDouble(4));
		}
		rs.close();
		statement.close();
		connection.close();
		scanner.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//deleteRecord();
		//updateRecord();
		displayOneRecord(1);
	}
}
