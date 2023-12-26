package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
public static void main(String[] args) {
	User u=new User();
	u.setId(5);
	u.setName("raju");
	u.setAge(27);
	u.setPassword("raj");
	u.setPhone(9133);
	Configuration cfg=new Configuration().configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session s=factory.openSession();
	s.update(u);
	Transaction t=s.beginTransaction();

	t.commit();
	System.out.println("update user with Id"+u.getId());
}

}

