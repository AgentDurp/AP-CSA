public class Encoder{
    public static String Caeser(String input,int shiftAmt){
        String answer="";
        for(int i=0;i<input.length();i++){
            int tempInt=0;
            if(input.charAt(i)<97){
                //if the character is not alphabetical
                 tempInt=input.charAt(i)-shiftAmt;
                answer+=String.valueOf((char)tempInt);
            }else{
            if(input.charAt(i)-shiftAmt<97){
                //if it needs to loop over from a to z
                tempInt=122-(shiftAmt-1);
                answer+=String.valueOf((char)tempInt);  
            }else{
                //the normal case
                tempInt=input.charAt(i)-shiftAmt;
                answer+=String.valueOf((char)tempInt);
            }
        }
        }

        return answer;
    }
}