/*Christopher Orban
 * AP Computer Science A
 * probem set 2C
 * Sept. 27, 2024
 */
import java.util.Scanner;
class Driver{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        OrderedPair myPair=new OrderedPair();
        Function f=new Function();
        int tempInt1;//stores values taken from the scanner
        double tempDoub1,tempDoub2,tempDoub3;
        System.out.println("quadratic forumla calculator, input 3 numbers, coefficients in the equation ax^2+bx+c");
        tempDoub1=input.nextDouble();//takes values from scanner and stores them in tempDoub1,2,and 3
        tempDoub2=input.nextDouble();
        tempDoub3=input.nextDouble();
        System.out.println("ans1,ans2: ");
        System.out.println(f.Quadratic(tempDoub1,tempDoub2,tempDoub3));
        System.out.println("slope calculator, input 2 points");
        f.takeInputsOrderedPairs();
        System.out.println(f.findSlope(f.tempA,f.tempB));
        System.out.println("midpoint calculator, input 2 points");
        f.takeInputsOrderedPairs();
        System.out.println(f.findMidpoint(f.tempA,f.tempB));
        System.out.println("sum of an arithmatic series, input number a,r, and k");
        f.takeInputsSeries();
        System.out.println(f.findArithmeticSeriesSum(f.a,f.r,f.k));
        System.out.println("sum of a geometric series, input number a,r, and k");
        f.takeInputsSeries();
        System.out.println(f.findGeometricSeriesSum(f.a,f.r,f.k));
        System.out.println("random dice roll, input a maximum value");
        tempInt1=input.nextInt();
        System.out.println(f.rollDie(tempInt1));
    }
}