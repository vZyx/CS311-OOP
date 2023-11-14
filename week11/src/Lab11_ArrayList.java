import java.awt.event.HierarchyListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab11_ArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list1.add(input.nextInt());

        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list2.add(input.nextInt());

        ArrayList<Integer> list3 = union(list1, list2);

        System.out.print("The combined list is ");
        for (int i = 0; i < list3.size(); i++)
            System.out.print(list3.get(i) + " ");
    }//end of main

    //Union Method
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> result = new ArrayList<>();// list1 + list2 elements

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            result.add(list2.get(i));
        }

        return result;
    }//end of union method
}//end of class
