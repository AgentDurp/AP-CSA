public class Fractions{
    private int denom;  
    private int numer;
    public Fractions(){
        denom=1;
        numer=1;
    }

    public Fractions (int den, int num){
        setDenom(den);
        setNum(num);
    }

    public Fractions(String fract){
        numer=Integer.parseInt(fract.substring(0,1));

        denom=Integer.parseInt(fract.substring(2));
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
        int GCF=GCF(numer,denom);
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
        return output;
    }
    public static Fractions divide(Fractions in1, Fractions in2){
        Fractions output= new Fractions();
        output.setNum(in1.getNum()*in2.getDenom());
        output.setDenom(in1.getDenom()*in2.getNum());
        return output;
    }
}
