import java.util.ArrayList;
import java.util.Scanner;

/**
 * lab 11 ex3 rewrite lab10 using ArrayList
 * @author maltassan
 */
public class Lab11_ex3_ArrayList {
    public static void main(String[] args) {
        //declare few Teacher and Student objects
        //Put them in a Person ArrayList to test Polymorphism

        ArrayList<Person> arr = new ArrayList<>();

        String std1Name = "Yara Mohammed Hammad";
        String std1Address = "Ibn majed street, Dammmam, Eastren province, Saudi Arabia";
        Student std1 = new Student(std1Name, std1Address);
        arr.add(std1);

        arr.add(new Teacher("Nora Alrashed", "Dhahran, Saudi Arabia"));

        for (Person p : arr)
            moreDetails(p);

        System.out.println("\n\n");
        for (int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }//end of main

    public static void moreDetails(Person currentPerson) {
        Scanner input = new Scanner(System.in);
        if (currentPerson instanceof Teacher) {
            System.out.println("\nTeacher: " + currentPerson.getName());
            Teacher t = (Teacher) currentPerson;
            System.out.println("Please Enter course name: ");
            t.addCourse(input.nextLine());
        }
        if (currentPerson instanceof Student) {
            System.out.println("\nStudent: " + currentPerson.getName());
            Student s = (Student) currentPerson;
            System.out.println("Please Enter course name: ");
            String courseName = input.nextLine();
            System.out.println("Please Enter grade: ");
            int grade = input.nextInt();
            s.addCourseGrade(courseName, grade);
        }
    }//end of moreDetails method

}//end of class
