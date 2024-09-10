/**
 * AP Comp Sci
 * Chris Orban
 * First Project
 */
import java.util.Scanner;

public class HelloWorld{
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        
         System.out.print("What is your favourite course at school ");
        String course=in.nextLine();
        System.out.print("What is your favourite tv show ");
        String show=in.nextLine();
        System.out.print("How many hours do you spend studying each day ");
        int studyhours=in.nextInt();
        System.out.print("How many hours do you spend watching shows each day ");
        int showhours=in.nextInt(); 
        float showpercent = ((showhours*7)/112*100);
        
        System.out.println("Summary: Favourite show: "+show+", Favourite course: "+course+", Hours studied per day: "+studyhours+", Hours spent watching show each day: "+showhours);
        System.out.println("Hours studying per day: "+studyhours+", Hours watching shows per day: " +showhours);
        System.out.println("Total hours studied per week: "+studyhours*7+", Total hours spent watching shows per week: "+showhours*7);

 
        
        
       
    }
}