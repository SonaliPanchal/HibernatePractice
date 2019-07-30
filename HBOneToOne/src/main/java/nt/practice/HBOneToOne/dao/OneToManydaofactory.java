package nt.practice.HBOneToOne.dao;

//if peerson dont want too b
public class OneToManydaofactory {

	public static OnetoManyDao getInstance()
	{
		return new OnetoManyDaoImpl();
		
	}
}
