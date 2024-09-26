public class StringTools{
    StringTools(){
        //no instance variables needed
    }

    public String lastLetter(String str){

        return str.substring(str.length()-1);//returns the last letter of a given string
    }

    public String formatPhoneNumber(String str1){
        String formatted="("+str1.substring(0,3)+") "+str1.substring(3,6)+"-"+
            str1.substring(6);
        return formatted;//returns a 10 character string in the format of (xxx) xxx-xxxx
    }

    public String middleThree(String str){
        return str.substring(str.length()/2-1,str.length()/2+2);
        //returns the middle three letters from a string with an odd number of characters
    }

    public String swapLastTwo (String str){
        String swapped;
        swapped=str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
        return swapped;
        //returns a string with the last 2 letters swapped
    }

    public boolean frontAgain (String str, int n){
        String frontString=str.substring(0,n);
        String backString=str.substring(str.length()-n);
        return frontString.equals(backString);
        //returns a boolean to see if a number n of letters of a string are the same at the beginning as at the end
    }

}