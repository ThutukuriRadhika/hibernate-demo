package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
public static void main(String[] args) {
	User u=new User();
	u.setName("radhi");
	u.setAge(23);
	u.setPassword("a123");
	u.setPhone(1234);
	Configuration cfg=new Configuration().configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session s=factory.openSession();
	Transaction t=s.beginTransaction();
	s.save(u);
	
	t.commit();
	System.out.println("user saved with Id:"+u.getId());
}
}
