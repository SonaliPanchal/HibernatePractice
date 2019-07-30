package net.javaguides.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.entity.Empoye1;
import net.javaguides.hibernate.utill.HibernateUtills;

public class SessionDeleteExample {
	Session session= null;
	Transaction transaction =null;
	
	public void deleteStudent(int id) {
		try {
			session = HibernateUtills.getSessionFactory().openSession();
		     transaction = session.beginTransaction();
		     Empoye1 emp = session.get(Empoye1.class, id);
		     
			if(emp!=null)
			{
				//session.delete(emp);
				session.remove(emp);
				System.out.println("record has been deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
