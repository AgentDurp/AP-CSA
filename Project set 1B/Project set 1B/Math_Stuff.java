/**
 * AP Comp Sci
 * Chris Orban
 * Math forumalae for problem set 1B
 *
 */
import java.util.Scanner;
public class Math_Stuff{

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);

         double farenheight;
        System.out.print("Celcius input: ");
        double celcius=input.nextDouble();
        System.out.println(+celcius*(9.0/5.0)+32+" degrees farenheight");
         
         
          System.out.println("BMI index calculator");
        System.out.println("Height input (in meters): ");
        double height=input.nextDouble();
        System.out.println("Weight input (in kilograms): ");
        double weight= input.nextDouble();
         
         System.out.println("BMI output: "+weight/(height*height));
        System.out.println("Days to Weeks Calculator");
        System.out.println("Days input: ");
        int days=input.nextInt();
        System.out.println("Weeks: "+days/7+" Days: "+days%7);
        

        System.out.println("Reciept Calculator");
        System.out.println("Price of item: ");
        double price=input.nextDouble();
        System.out.println("Amount of item: ");
        int amount =input.nextInt();
        System.out.println("tax % on item: ");
        double tax=(input.nextDouble()/100.0);
        System.out.println("Reciept: "+(price*amount+(price*amount)*tax));
    
        System.out.println("Calculator to add each digit of a 3 digit number");
        System.out.println("number input: ");
        int num=input.nextInt();
        System.out.println("sum: "+((num%10)+(num/100)+((num/10)%10)));
    }
}