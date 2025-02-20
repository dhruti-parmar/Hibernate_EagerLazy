package com.hibernet.eager.Demolazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Laptop;
import com.hibernate.model.User;

public class App
{
    public static void main( String[] args )
    {
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(102);
//    	laptop.setBrand("HP");
//    	laptop.setPrice(50000);
//
//    	User user = new User();
//    	user.setUid(2);
//    	user.setUname("Hemu");
//    	user.getLaps().add(laptop);
//    	laptop.setUser(user);

    	Configuration cfg = new Configuration();
    	cfg.configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(User.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();

    	session.beginTransaction();

//    	session.persist(user);
//    	session.persist(laptop);

    	User u1 = session.get(User.class, 3);

    	System.out.println(u1.getUname());
//    	Collection<Laptop> laps = u1.getLaps();
//
//    	for(Laptop l : laps) {
//    		System.out.println(l);
//    	}

      	session.getTransaction().commit();
    }
}