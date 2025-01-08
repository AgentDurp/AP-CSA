public class FractionDriver{
    public static void main(String[] args){
        Fractions frac1=new Fractions(252,105);
        Fractions frac2=new Fractions();
        Fractions frac3=new Fractions("1/3");
        System.out.println(frac1);
        System.out.println(frac2);
        System.out.println(frac3);
        frac1.reduce();
        System.out.println(frac1);
    }
}