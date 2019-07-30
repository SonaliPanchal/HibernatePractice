package net.javaguides.hibernate.utills;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill2 {private static final SessionFactory sessionFactory;
static {
	try {
		sessionFactory = new Configuration().configure()
				.buildSessionFactory();
	} catch (Throwable ex) {
		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}
}

public static SessionFactory getSessionFactory() {
	return sessionFactory;
}}
