import java.util.Scanner;

   public class Q14{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Year to check whether it is leap year or not: ");
 int year=sc.nextInt();
 
 if(year % 4==0 && year%100!=0 || year % 400==0)
 {
   System.out.println(year+" Is a leap year");
 }
 else 
 {
   System.out.println(year+" Is not a leap year");
 }
}
}