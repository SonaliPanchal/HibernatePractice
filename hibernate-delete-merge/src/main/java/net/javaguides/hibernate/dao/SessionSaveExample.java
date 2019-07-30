package net.javaguides.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.entity.Empoye1;
import net.javaguides.hibernate.utill.HibernateUtills;

public class SessionSaveExample {
	Session session= null;
	Transaction transaction =null;

	public void savedata(Empoye1 emp) {
		try {
			session = HibernateUtills.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(emp);
			// System.out.println("Inserted Recods"+e1.toString());
			transaction.commit();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
