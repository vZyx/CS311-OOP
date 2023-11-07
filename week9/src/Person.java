import java.util.Scanner;

public class Person
{
        static String main_menu="\n*** Welcome to Collage System ***\n"+
                "1- Teacher Subsystem\n" +
                "2- Student Subsystem\n" +
                "3- Exit \n"+
                "Your Choice: " ;

        static String teacher_menu="\n\t*** Welcome to Teacher Sub-system ***\n"+
                "\t1- add your personal information \n" +
                "\t2- add new course \n" +
                "\t3- remove a course\n"+
                "\t4- Print all courses \n"+
                "\t5- Exit \n"+
                "\tYour Choice: " ;

        static String student_menu="\n\t*** Welcome to Student Sub-system ***\n"+
                "\t1- add your personal information \n" +
                "\t2- add course \n" +
                "\t3- print grades\n"+
                "\t4- get the grades average \n"+
                "\t5- Exit \n"+
                "\tYour Choice: " ;;

        static Scanner input =new Scanner(System.in);

        static Teacher teacher1;
        static Student std1;
        static String name;
        static String address;

    public Person(String name, String address)
    {

    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {

            int choice=0;
            do
            {
                System.out.print(main_menu);
                choice=input.nextInt();

                switch (choice)
                {
                    case 1:
                        teacher_System();
                        break;
                    case 2:
                        student_System();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.print("Wrong Entry. Please enter a valid option.");

                }

            } while (choice!=3);

        }

        static void teacher_System()
        {
            int choice;
            do{

                System.out.print(teacher_menu);
                choice=input.nextInt();


                switch (choice)
                {
                    case 1:
                        input.nextLine();

                        System.out.print("\tPlease enter teacher's Name:");
                        name=input.nextLine();

                        System.out.print("\tPlease enter teacher's address:");
                        address=input.nextLine();

                        // Create teacher object
                        teacher1 = new Teacher(name , address);
                        System.out.println(teacher1.toString());
                        break;
                    case 2:// add new course
                        System.out.print("\tPlease enter the course name:");
                        String courseName=input.next();

                        if (teacher1.addCourse(courseName))
                            System.out.println(courseName+ " added");
                        else
                            System.out.println(courseName + " can not be added");
                        break;
                    case 3:// remove course
                        input.nextLine();
                        System.out.print("\tPlease enter the course name :");
                        String delCourse=input.nextLine();

                        if (teacher1.removeCourse(delCourse))
                            System.out.println(delCourse+ " removed");
                        else
                            System.out.println(delCourse + " can not be removed");
                        break;
                    case 4:
                        teacher1.printCourses();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.print("Wrong Entry. Please enter a valid option.");

                }

            } while (choice!=5);
        }

        static void student_System()
        {
            int choice;
            do{

                System.out.print(student_menu);
                choice=input.nextInt();
                switch (choice)
                {
                    case 1:
                        input.nextLine();
                        System.out.print("\tPlease enter strudent's Name:");
                        name=input.nextLine();

                        System.out.print("\tPlease enter student's address:");
                        address=input.nextLine();

                        std1 = new Student(name,address);
                        System.out.println(std1.toString());
                        break;
                    case 2:
                        input.nextLine();
                        System.out.print("\tPlease enter the course name:");
                        String course=input.nextLine();
                        System.out.print("\tEnter its grade:");
                        int grade=input.nextInt();
                        std1.addCourseGrade(course,grade);
                        break;
                    case 3:
                        std1.printGrades();
                        break;
                    case 4:
                        System.out.printf("Student Average: %.2f\n\n", std1.getAverage());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.print("Wrong Entry. Please enter a valid option.");

                }

            } while (choice!=5);

        }
    }

