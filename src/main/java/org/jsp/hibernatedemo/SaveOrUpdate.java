package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Id to update");
	int id=sc.nextInt();
	System.out.println("Enter  the name, phone, age and password");
	String name=sc.next();
	String password=sc.next();
	long phone=sc.nextLong();
	int age=sc.nextInt();
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	User u=new User();
	u.setId(id);
	u.setName(name);
	u.setPhone(phone);
	u.setAge(age);
	u.setPassword(password);

	s.merge(u);
	Transaction t=s.beginTransaction();
	t.commit();
	s.close();
	
}
}
