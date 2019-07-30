package nt.practice.HBOneToOne.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nt.practice.HBOneToOne.domain.PhoneNumber;
import nt.practice.HBOneToOne.domain.User;
import nt.practice.HBOneToOne.utill.HibernateUtiils;

public class OnetoManyDaoImpl implements OnetoManyDao {

	@Override
	public void saveData() {

		Session sess = null;
		User user = null;
		PhoneNumber phone1 = null,phone2=null;
		Set<PhoneNumber> set = null;
		Transaction tx = null;

		sess = HibernateUtiils.getSession();
		//prepare parent obje
		user = new User();
		user.setUser_id(101);
		user.setFirstName("Lalitha");
		user.setLastName("reddy");
		user.setAddress("hydb");

		//prepare child object 
		phone1 = new PhoneNumber();
		phone1.setNumberType("residence");
		phone1.setProvider("idea");
		phone1.setPhone(9889989);

		phone2 = new PhoneNumber();
		phone2.setNumberType("office");
		phone2.setProvider("airtel");
		phone2.setPhone(9889989);
		//add child to set collection
		set = new HashSet<PhoneNumber>();
		set.add(phone1);
		set.add(phone2);

		//give this set collection to parent 

		user.setPhones(set);
		//save Object
		try {
			tx = sess.beginTransaction();
			tx.commit();
			System.out.println("Objects Are Saved");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Objects Are not Saved");
			e.printStackTrace();
		}
	}

}
