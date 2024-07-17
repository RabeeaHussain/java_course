package ja.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    
        System.out.println("enter two numbers");
        double x= scanner.nextDouble();
        double y=scanner.nextDouble();

        System.out.println("the value of x is "+x+ " the value of y is "+y);
        double z= Math.sqrt((x*x)+(y*y));
        

        System.out.println("the hypotenus of the sides is "+z);
        scanner.close(); 
    }
}