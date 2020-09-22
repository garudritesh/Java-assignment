import java.util.Scanner;

   public class Q10{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter temperature in Fahrenheit: ");
   double fTemp=sc.nextDouble();
   double cTemp=5*(fTemp-32)/9;
   System.out.println("The Temperature in celsius: "+cTemp);
}
}