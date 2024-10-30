public class Decoder{
    public static String Caeser(String input, int shiftAmt){
        String answer="";
        for(int i=0;i<input.length();i++){
            int tempInt=0;
            if(input.charAt(i)<97){
                //if character is not alphabetical
                 tempInt=input.charAt(i)+shiftAmt;
                answer+=String.valueOf((char)tempInt);
            }else{
            if(input.charAt(i)+shiftAmt>122){
                //if it needs to loop over from z to a
                tempInt=97+(shiftAmt-1);
                answer+=String.valueOf((char)tempInt);  
            }else{
                //the normal case
                tempInt=input.charAt(i)+shiftAmt;
                answer+=String.valueOf((char)tempInt);
            }
        }
        }

        return answer;
    }
}