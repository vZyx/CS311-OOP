package lab12_13;

import java.util.ArrayList;

public class Lab12_13 {
    public static void main(String[] args) {
        ArrayList<Device> device= new ArrayList<>();

        //fixed values
        //or another idea,  is to better to let the user input them (loop, ask the user the type of device and input accordingly until Quit)
        device.add(new Phone(2500, 2));
        device.add(new Phone(3000, 1));

        device.add(new Fridge(4000, 4));
        device.add(new Fridge(2000, 5));

        //print all devices
        for (int i=0;i<device.size();i++)
            System.out.println(device.get(i).toString());

        //compare two fridges
        switch (((Fridge)device.get(2)).compareTo(((Fridge)device.get(3)))) {
            case 1:
                System.out.println("\nFridge with ID " + device.get(2).getID() +" has more shelves.");
                break;
            case -1:
                System.out.println("\nFridge with ID " + device.get(3).getID() +" has more shelves.");
                break;
            default:
                System.out.println("\nBoth fridges have the same number of shelves");
                break;
        }//end of switch
    }//end of main
}//end of class 
