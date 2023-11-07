
import java.util.Scanner;

public class task1 {

  public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        int [][] rainfall  = new int [4][7];
        
        System.out.println("Please enter the rainfall rate for 4 weeks");
        
        for (int i=0;i<4;i++)
        {
            System.out.print("Week#"+ (i+1) + "  ");
              for (int j=0;j<7; j++)
                  rainfall[i][j] = input.nextInt();
        }
        
        System.out.println("Classification for each week:");
        double sum , average;
        for (int i=0;i<4;i++)
        {
            System.out.print("Week#"+ (i+1)+ " : ");
            sum = 0 ;
            for ( int j=0;j<7; j++)
                 sum+= rainfall[i][j];
            
            average = sum/7;
            getClassification(average);
        }//end of 1st for-loop
    }//end of main
    
    public static void getClassification (double avg)
    {
        if (avg >= 6 )
            System.out.println("High");
        else if (avg > 3 )
            System.out.println("Medium");
        else 
            System.out.println("Low");
    }//end of getClassification method
}
