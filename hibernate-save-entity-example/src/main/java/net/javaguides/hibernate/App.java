package net.javaguides.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.utills.HibernateUtill;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Student student = new Student("Ramesh0000000888", "Fadatare", "rameshfadatare@javaguides.com");
		Student student1 = new Student("John", "Cena", "john@javaguides.com");

		//persistStudent(student);
		saveOrUpdateStudent(student);

	}

	private static void saveOrUpdateStudent(Student student) {
		Transaction transaction = null;
		Session session1 = null;
		try {
			session1 = HibernateUtill.getSessionFactory().openSession();
			transaction = session1.beginTransaction();
			session1.saveOrUpdate(student);
			Student student2 = session1.get(Student.class, 2);
			student2.setFirstName("Aaatish");
			session1.saveOrUpdate(student2);
			transaction.commit();
			session1.close();
			Session session2 = HibernateUtill.getSessionFactory().openSession();
			Transaction transection1 = session2.beginTransaction();
			student.setFirstName("sona876868568");
			session2.merge(student);
			transection1.commit();
			session2.close();
			

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}

	public static void persistStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		try  {
			// start a transaction
			session = HibernateUtill.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			// save the student object
			session.persist(student);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
}
