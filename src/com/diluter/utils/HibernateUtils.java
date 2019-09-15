package com.diluter.utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateUtils {
	
	private static SessionFactory factory;
	private static Configuration configuration;
	
	static {
		configuration = new Configuration().configure();
		//µêÀÀ¾÷µ²§ô®É
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				factory.close();
				
			}
		}));
	}
	
	public static Session openSession() {
		factory =configuration.buildSessionFactory();
		return factory.openSession();
	}
	
	public static Session getCurrentSession() {
		factory = configuration.buildSessionFactory();
		   return factory.getCurrentSession();
	}
	
	
	
	

}
