
import java.util.Scanner;

public class task2 {


    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        
        String fName, mName, lName = "";
        int age = 0;
        
         System.out.print("First name: ");
         fName = input.next();
         System.out.print("Middle name: ");
         mName = input.next();
         System.out.print("Last name: ");
         lName = input.next();
         System.out.print("Age: ");
         age = input.nextInt();
         
         
         int midmName =(mName.length()) / 2;
         String intials = fName.charAt(0) + mName.substring(midmName, midmName + 1) + lName.charAt(lName.length() - 1);;
         
         
         System.out.print("Your password = " + intials.toUpperCase() + age*100 );
    }
}
