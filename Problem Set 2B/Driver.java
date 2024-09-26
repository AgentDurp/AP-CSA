/** Christopher Orban, AP Computer Science A, Project set 2B, Sept.25,2024
 * 
 */ 
import java.util.Scanner;
class Driver{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StringTools myStringTools=new StringTools();//making an instance of the tools class
        System.out.println("input a word, will output the last letter of that word");
        String ans=in.nextLine();
        System.out.println(myStringTools.lastLetter(ans));
        System.out.println("input a string and an integer,\nwill output if the integer amount of letters in that word are the same at the beginning as at the end");
        ans=in.nextLine();       
        int ansInt=in.nextInt();
        in.nextLine(); //jank
        System.out.println(myStringTools.frontAgain(ans,ansInt));
        System.out.println("input a 10 character phone number, will out put the phone number in the format (xxx) xxx-xxxx");
        ans=in.nextLine();
        System.out.println(myStringTools.formatPhoneNumber(ans));
        System.out.println("input a string with odd number of characters, will output the middle 3 letters of that string");
        ans=in.nextLine();
        System.out.println(myStringTools.middleThree(ans));
        System.out.println("input a string, will output a the string with the last 2 letters swapped");
        ans=in.nextLine();
        System.out.println(myStringTools.swapLastTwo(ans));
    }
}