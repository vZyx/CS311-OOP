import java.util.Scanner;

public class Lab10_polymorphism
{
    public static void main(String[] args) {
        //declare few Teacher and Student objects
        String std1Name = "Yara Mohammed Hammad";
        String std1Address = "Ibn majed street, Dammmam, Eastren province, Saudi Arabia";
        Student std1 = new Student(std1Name, std1Address);

        String std2Name = "Aysha Mohammed Alkhan";
        String std2Address = "King Fahad street, Khobar, Eastren province, Saudi Arabia";
        Student std2 = new Student(std2Name, std2Address);

        Teacher teacher1 = new Teacher("Nora Alrashed", "Dhahran, Saudi Arabia");
        Teacher teacher2 = new Teacher("Arwa Almazroua", "Dammam, Saudi Arabia");

        //Put them in a Person Array to test Polymorphism
        Person[] arr = new Person[4];
        arr[0] = std1; //Implicit casting
        arr[1] = std2;
        arr[2] = teacher1;
        arr[3] = teacher2;

        for (Person p : arr)
            moreDetails(p);

        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
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

