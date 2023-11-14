import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) list1.add(input.nextInt());

        System.out.println("Removing duplicates...");
        removeDuplicate(list1);

        System.out.println("Displaying list...");
        System.out.println(list1);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < list.size(); i++)
            if ( !temp.contains(list.get(i)) )
                temp.add(list.get(i));

        list.clear();
        list.addAll(temp);
    }//end of removeDuplicate method
}//end of class

