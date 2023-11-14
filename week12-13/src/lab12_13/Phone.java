package lab12_13;

public class Phone extends Device implements Cloneable {
    private int numSIM;

    public Phone(double price, int numSIM) {
        super(price);
        this.numSIM = numSIM;
    }

    public int getNumSIM() {
        return numSIM;
    }

    public void setNoOfSIM(int numSIM) {
        this.numSIM = numSIM;
    }

    @Override
    public String toString() {
        return "Phone{" +super.toString() +", SIM cards=" + numSIM + '}';   }

    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }

    //or it is better to deal with the error here

    @Override
    protected Object clone() {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }//end of clone() method

}//end of class

