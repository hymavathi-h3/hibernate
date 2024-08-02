package com.course.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

//		Configuration con = new Configuration().configure();

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();

		// data will be inserted into the database

		SessionFactory sf = mt.buildSessionFactory();

		// data will be insered into the database //importing session factory from the
		// hibernate.cfg.xm file //verifying

		Session s = sf.openSession();

		// opens the table // all data will be here //entering amount

		Transaction t = s.beginTransaction();

		// enters the data into the respective columns

		employee e = new employee(); // creating object for model to get setters from model

		System.out.println("Enter name");

		String name = scr.nextLine();

		e.setName(name);

		System.out.println("Enter branch");

		String branch = scr.nextLine();

		e.setBranch(branch);

		System.out.println("Enter email");

		String email = scr.nextLine();

		e.setEmail(email);
		System.out.println("Enter password");

		String password = scr.nextLine();

		e.setPassword(password);
		System.out.println("Enter phonenum");

		Long phonenum = scr.nextLong();

		e.setPhonenum(phonenum);

		// insertin data ino the table
		 
//		e.setName("hymavathi");
//		e.setBranch("ECE");
//		e.setName(name);                             //for static way of inserting data into the database
//      e.setEmail("hymavathi@gmail.com");
//      e.setPassword("hyma2003");

		s.save(e);

		// data is present in e..so passing e to save

		t.commit();

		// shows wheather the data is inserted or not

		// like transferred successfully notification

		System.out.println("inserted successfully");

		sf.close();

		s.close();
	}
}
