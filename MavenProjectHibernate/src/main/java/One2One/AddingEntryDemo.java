package One2One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddingEntryDemo {
		 
	    public static void main(String[] args)
	    {
	 
	        // Create session factory
	        SessionFactory factory
	            = new Configuration()
	                  .configure("hibernate.cfg.xml")
	                  .addAnnotatedClass(Student.class)
	                  .addAnnotatedClass(StudentGfgDetail.class)
	                  .buildSessionFactory();
	 
	        // Create session
	  Session session = factory.getCurrentSession();
	  Student student = new Student("Vyom", "Yadav",  "vyom@gmail.com");
	 
	            StudentGfgDetail studentGfgDetail
	                = new StudentGfgDetail("GFG College", 20);
	 
	            student.setStudentGfgDetail(studentGfgDetail);
	 
	            // Begin the transaction
	            session.beginTransaction();
	 
	            // Save the student object.
	            // This will also save the StudentGfgDetail
	            // object as we have used CascadeType.ALL
	            session.save(student);
	 
	            // Commit the transaction
	            session.getTransaction().commit();
	 
	            System.out.println(
	                "Transaction Successfully Completed!");
	        }
	        
	    
	
}
