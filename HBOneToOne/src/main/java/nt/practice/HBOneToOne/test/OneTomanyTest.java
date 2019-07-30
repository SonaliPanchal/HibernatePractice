package nt.practice.HBOneToOne.test;

import nt.practice.HBOneToOne.dao.OneToManydaofactory;
import nt.practice.HBOneToOne.dao.OnetoManyDao;
import nt.practice.HBOneToOne.utill.HibernateUtiils;

public class OneTomanyTest {
	public static void main(String[] args) {
		//get dao
		OnetoManyDao dao = null;
		//
		dao = OneToManydaofactory.getInstance();
		//invoke method
		dao.saveData();
		
		/* System.exit(0); */
		HibernateUtiils.closeSession();
		/* HibernateUtiils.closeSessionfactory(); */

	}//main
}//class
