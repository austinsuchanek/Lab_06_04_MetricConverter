import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the measurement in meters: ");
        float meters=sc.nextFloat();
        float miles=(meters/1609);
        double feet=(meters*3.28084);
        double inches=(meters*39.37);
        System.out.println("The measurement in miles is: "+miles);
        System.out.println("The measurement in feet is: "+feet);
        System.out.println("The measurement in inches is: "+inches);
    }
}