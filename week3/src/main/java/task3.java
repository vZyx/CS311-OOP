
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ziyad
 */
public class task3 {

    public static void main(String args[]) {
     
     Scanner input=new Scanner(System.in);
     String str;
     int pos;
     
     System.out.println("Enter a String(with at least 3 'm' characters): ");
     str=input.nextLine();
          
     //find and remove 1st M/m
     pos=str.toLowerCase().indexOf("m");
     String newStr= str.substring(0, pos) + str.substring(pos + 1); 
     
     //find and remove 2nd M/m
     pos=newStr.toLowerCase().indexOf("m"); 
     newStr= newStr.substring(0, pos) + newStr.substring(pos + 1); 
     
     //find and remove 3rd M/m
     pos=newStr.toLowerCase().indexOf("m"); 
     newStr= newStr.substring(0, pos) + newStr.substring(pos + 1);
     System.out.println("The new string: " + newStr );
     
     
    //better to solve it with a for loop
    //int mcount=0; String str2="";    
    //for (int i = 0; i < str.length; i++) {
    //     if(mcount<3)
    //	   if(str.toLowerCase().charAt(i)==’m’)
    //         {   mcount++; continue;    }
    //     str2+=str.charAt(i);
    //}
    //print both strings :)
    }
}
