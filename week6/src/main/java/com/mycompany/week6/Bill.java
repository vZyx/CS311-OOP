
package com.mycompany.week6;

public class Bill 
{

    public static double getBill(Order [] order)
    {
        double bill= 0.0; 
        for(int i=0; i< order.length; i++)
            bill+=order[i].getorderPrice() ;
            return bill;
    }
    
    public static void main(String[] args) 
    {
        Order [] orders= new Order[2];
        orders[0]= new Order("Rice", 30);
        orders[1]= new Order("Pasta", 40);
        
        for(int i=0; i< orders.length; i++)
        System.out.println("Order #" + (i+1) + orders[i].getOrderName()+ ", and it's price: " + orders[i].getorderPrice());
   
        System.out.println("Number of orders: "+ Order.numberOfOrders + " ,and the bill will be: "+ getBill(orders));
    }  
}

class Order
{
    public static int numberOfOrders=0;
    private String orderName;
    private double orderPrice;
    
    public Order(String orderName, double orderPrice){
        this.orderName=orderName;
        this.orderPrice=orderPrice;
        numberOfOrders++;
    }

    public String getOrderName(){
        return orderName;
    }
    public double getorderPrice(){
        return orderPrice;
    }} 

