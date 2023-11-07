/**
 * lab 7+8
 * @author maltassan
 */
public class Student {
    //data fields
    private String ID;
    private String FirstName,LastName;
    private float GPA;
    private LocalDate BDate;
    public static int studCounter=0;
    
    private StudyProgram program; //has-a relation
    
    //Constructors
    Student(){ this("","","",LocalDate.of(0,0,0),0 ,new StudyProgram());  }
    
    Student(String id, String FName, String LName,LocalDate BD,float gpa, StudyProgram p){
        ID=id;
        FirstName=FName;
        LastName=LName;
        BDate=BD;
        setGPA(gpa); 
        program=p;
        studCounter++;
    }
   
    //Accessor and Mutator Methods

    public void setID(String ID){ this.ID = ID;  }
    public String getID(){ return ID;   }
    
    public void setFirstName(String FirstName){  this.FirstName = FirstName; }
    public String getFirstName(){ return FirstName;  }
    
    public void setLastName(String LastName){ this.LastName = LastName;    }
    public String getLastName(){ return LastName;    }

    public void setGPA(float GPA){ this.GPA = (GPA>0 && GPA<6)?GPA:0; }
    public double getGPA(){ return GPA;    }

    public void setBDate(LocalDate BDate){ this.BDate = BDate; }
    public LocalDate getBDate(){ return BDate;   }
    
    public void setQualification(StudyProgram program){ this.program = program; }
    public StudyProgram getQualification(){ return program;   }    
    
    //Other Methods
    public String getName()
    {return (FirstName + " " + LastName);}
    
    public int getAge()
    { 
        return (LocalDate.now().getYear()- BDate.getYear()) ; 
    }//end of getAge
       
    public void updateGPA(float newGPA)
    {
        setGPA((GPA+newGPA)/2);
    }//end of UpdateGPA 
    
}//end of class

//--------------------------------------

/**
 * lab 7+8
 * @author maltassan
 */

//immutable class
public class StudyProgram {
    private String Major;
    private String Degree;
    private int GradYear;
    
    public StudyProgram(){ this(null, null, 0);}
    
    public StudyProgram(String Deg, String Mj, int Yr){
        Major=Mj;
        Degree=Deg;
        GradYear=Yr;
    } 
    
    public String getMajor() {
      return Major;
    }

    public String getDegree() {
        return Degree;
    }

    public int getGradYear() {
        return GradYear;
    }
    
    @Override
    public String toString() {
      return Degree+" - "+Major+" - "+GradYear;
    }
    
}//end of class
