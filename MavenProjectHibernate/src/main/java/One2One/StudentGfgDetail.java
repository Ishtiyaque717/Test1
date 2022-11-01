package One2One;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "student_gfg_detail")
	public class StudentGfgDetail {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	 
	    @Column(name = "college") private String college;
	 
	    @Column(name = "no_of_problems_solved")
	    private int noOfProblemsSolved;
	 
	    public StudentGfgDetail() {}
	 
	    public StudentGfgDetail(String college,
	                            int noOfProblemsSolved)
	    {
	        this.college = college;
	        this.noOfProblemsSolved = noOfProblemsSolved;
	    }
	 
	    public int getId() { return id; }
	 
	    public void setId(int id) { this.id = id; }
	 
	    public String getCollege() { return college; }
	 
	    public void setCollege(String college)
	    {
	        this.college = college;
	    }
	 
	    public int getNoOfProblemsSolved()
	    {
	        return noOfProblemsSolved;
	    }
	 
	    public void
	    setNoOfProblemsSolved(int noOfProblemsSolved)
	    {
	        this.noOfProblemsSolved = noOfProblemsSolved;
	    }
	 
	    @Override public String toString()
	    {
	        return "StudentGfgDetail{"
	            + "id=" + id + ", college='" + college + '\''
	            + ", noOfProblemsSolved=" + noOfProblemsSolved
	            + '}';
	    }
	}

