package net.javaguides.hibernate;

import net.javaguides.hibernate.dao.SessionDeleteExample;
import net.javaguides.hibernate.dao.SessionSaveExample;
import net.javaguides.hibernate.entity.Empoye1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   // first save few records to database
    	SessionSaveExample empoyeDao = new SessionSaveExample();
    	
    	Empoye1 e1 = new Empoye1("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
    	Empoye1 e2 = new Empoye1("John", "Cena", "johncena@javaguides.com");
    	Empoye1 e3 = new Empoye1("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
    	Empoye1 e4 = new Empoye1("John", "Cena", "johncena@javaguides.com");
    	empoyeDao.savedata(e1);
    	empoyeDao.savedata(e2);
    	empoyeDao.savedata(e3);
    	empoyeDao.savedata(e4);
    	
        // delete student
    	SessionDeleteExample deleteExample = new SessionDeleteExample();
        deleteExample.deleteStudent(1);
    	
    }
    
    
}
