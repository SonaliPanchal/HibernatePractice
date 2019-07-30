package nt.practice.HBOneToOne.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtiils {
	
	private static SessionFactory sessionfactory;
	private static Session session;
	static
	{
		sessionfactory = new Configuration().configure("/nt/practice/HBOneToOne/cfgs/hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static Session getSession()
	{
		return session = sessionfactory.openSession();
	}
	
	public static void closeSession()
	{
		session.close();
	}
	
	public static void closeSessionfactory()
	{
		sessionfactory.close();
	}

}
