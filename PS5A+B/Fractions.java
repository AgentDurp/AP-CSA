import java.util.*;
public class Fractions{
    static Scanner in=new Scanner(System.in);
    private int denom;  
    private int numer;
    public Fractions(){
        denom=(int)(Math.random()*10+1);
        numer=(int)(Math.random()*10+1);
    }

    public Fractions (int num, int den){
        setDenom(den);
        setNum(num);
    }

    public Fractions(String fract){
        numer=Integer.parseInt(fract.substring(0,fract.indexOf("/")));

        denom=Integer.parseInt(fract.substring(fract.indexOf("/")+1));
        if(denom==0){
            System.out.println("Error, denominator can not be 0");
            denom=1;  
        }

    }

    public Fractions (Fractions copy){
        numer=copy.numer;
        denom=copy.denom;
    }

    public int getNum(){
        return numer;
    }

    public int getDenom(){
        return denom;
    }

    public String toString(){
        return numer+"/"+denom;
    }

    public double toDouble(){
        return (double)numer/(double)denom;
    }

    public void reduce(){
        int GCF=GCF(Math.abs(numer),Math.abs(denom));
        numer/=GCF;
        denom/=GCF;
    }

    private int GCF(int in1, int in2){
        int input1=in1;
        int input2=in2;
        while(input1!=input2){
            if(input1>input2){
                input1-=input2;
            }else{
                input2-=input1;
            }
        }
        return input1;
    }

    public void setNum(int input){
        numer=input;
    }

    public void setDenom(int input){
        if(input!=0){
            denom=input;
        }else{
            System.out.println("Error, denominator can not be 0");
            denom=1;
        }
    }

    public static Fractions multiply(Fractions in1, Fractions in2){
        Fractions output=new Fractions();
        output.setNum(in1.getNum()*in2.getNum());
        output.setDenom(in1.getDenom()*in2.getDenom());
        output.reduce();
        return output;
    }

    public static Fractions divide(Fractions in1, Fractions in2){
        Fractions output= new Fractions();
        output.setNum(in1.getNum()*in2.getDenom());
        output.setDenom(in1.getDenom()*in2.getNum());
        output.reduce();
        return output;
    }

    public static Fractions add(Fractions in1, Fractions in2){
        Fractions output=new Fractions();
        output.setNum(in1.getNum()*in2.getDenom()+in2.getNum()*in1.getDenom());
        output.setDenom(in1.getDenom()*in2.getDenom());
        output.reduce();
        return output;
    }

    public static Fractions subtract(Fractions in1, Fractions in2){
        Fractions output=new Fractions();
        output.setNum(in1.getNum()*in2.getDenom()-in2.getNum()*in1.getDenom());
        output.setDenom(in1.getDenom()*in2.getDenom());
        output.reduce();
        return output;
    }

    public static void piEstimate(){
        final Fractions MILU=new Fractions(355,113);
        final double EPSILON=Math.abs(Math.PI-MILU.toDouble());
        Fractions estimate=new Fractions(355,113);
        while(!(Math.abs(Math.PI-estimate.toDouble())<EPSILON)){
            if(Math.PI-estimate.toDouble()>EPSILON){
                estimate.setNum(estimate.getNum()+1);
            }else{
                estimate.setDenom(estimate.getDenom()+1);
            }
        }
        System.out.println(estimate);
    }

    public boolean equals(Fractions in2){
        reduce();
        in2.reduce();
        return (numer==in2.getNum()&&denom==in2.getDenom());
    }

    public static void fractionGame(){
        int numCorrect=0;
        int numIncorrect=0;
        int numQuestions=0;
        System.out.println("press enter to start");
        while(!in.nextLine().equals("quit")){
            int operation=(int)(Math.random()*4+1);
            Fractions frac1=new Fractions();
            Fractions frac2=new Fractions(); 
            switch(operation){
                case 1:
                    System.out.println(frac1+"+"+frac2);
          
                    Fractions fracIn=new Fractions(in.nextLine());
                    if(Fractions.add(frac1,frac2).equals(fracIn)){
                        numCorrect++;
                        System.out.println("Correct!");
                    }else{
                        numIncorrect++;
                        System.out.println("Wrong, the answer was "+Fractions.add(frac1,frac2));
                    }
                    numQuestions++;
                    break;
                case 2:
                    System.out.println(frac1+"-"+frac2);
               
                    fracIn=new Fractions(in.nextLine());
                    if(Fractions.subtract(frac1,frac2).equals(fracIn)){
                        numCorrect++;
                        System.out.println("Correct!");
                    }else{
                        numIncorrect++;
                        System.out.println("Wrong, the answer was "+Fractions.subtract(frac1,frac2));
                    }
                    numQuestions++;
                    break;
                case 3:
                    System.out.println(frac1+"*"+frac2);
         
                    fracIn=new Fractions(in.nextLine());
                    if(Fractions.multiply(frac1,frac2).equals(fracIn)){
                        numCorrect++;
                        System.out.println("Correct!");
                    }else{
                        numIncorrect++;
                        System.out.println("Wrong, the answer was "+Fractions.multiply(frac1,frac2));
                    }
                    numQuestions++;
                    break;
                case 4:
                    System.out.println(frac1+"/"+frac2);

                    fracIn=new Fractions(in.nextLine());
                    if(Fractions.divide(frac1,frac2).equals(fracIn)){
                        numCorrect++;
                        System.out.println("Correct!");
                    }else{
                        numIncorrect++;
                        System.out.println("Wrong, the answer was "+Fractions.divide(frac1,frac2));
                    }
                    numQuestions++;
                    break;
            }
            System.out.println("press enter to continue or type quit to stop and get a summary");
        }
        //summary printing
        System.out.println("your win/loss ratio was "+numCorrect+"/"+numQuestions+" for a score of "+((double)numCorrect/numQuestions)*100+"%!");
        System.exit(0);
    }
}
