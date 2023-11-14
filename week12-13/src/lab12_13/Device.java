package lab12_13;

public abstract class Device {
    private static int startID = 1000;
    private final int ID;
    protected double price;

    protected Device(double price){
        this.ID = startID++;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID= " + ID + ", price= " + price ;
    }

}//end of class
