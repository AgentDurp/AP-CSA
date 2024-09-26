/** Christopher Orban, AP Computer Science A, Project set 2B, Sept.25,2024
 * 
 */ 
import java.util.Scanner;
class Driver{
    public static void main(String[] args){

        StringTools myStringTools=new StringTools();//making an instance of the tools class
        System.out.println(myStringTools.lastLetter("World!"));

        System.out.println(myStringTools.frontAgain("edited",1));
    }
}