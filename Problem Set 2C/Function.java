import java.util.Scanner;
 class Function{
    OrderedPair tempA=new OrderedPair(0,0);
    OrderedPair tempB=new OrderedPair(0,0);
    double a,r;
    int k;
    public OrderedPair Quadratic(double a,double b,double c){
        double ans1,ans2;
        ans1=(((-b)+Math.sqrt((Math.pow(b,2.0)-(4.0*a*c))))/2.0*a);
        ans2=((-(b)-Math.sqrt((Math.pow(b,2.0)-(4.0*a*c))))/2.0*a);
        return new OrderedPair(ans1,ans2);
 
    }

    public double findSlope(OrderedPair A, OrderedPair B){
        double slope;
        slope=(B.getY()-A.getY())/(B.getX()-A.getX());
        return slope;
    }

    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        return new OrderedPair((A.x+B.x)/2,(A.getY()+B.getY())/2);
    }

    public double findArithmeticSeriesSum (double a, double d, int k){
        double temp=(k/2)*(2*a+d*(k-1));
        return temp;
    }

    public double findGeometricSeriesSum (double a, double r, int k) {
        return a*((1-(Math.pow(r,k)))/(1-r));
    }

    public int rollDie (int sides){
        return (int)(Math.random()*sides)+1;
    }

    public void takeInputsOrderedPairs(){//prints prompts to take in 4 points, x1,y1,x2,y2 and store them in instance variables
        Scanner input=new Scanner(System.in);
        double in1,in2,in3,in4;
        in1=input.nextDouble();
        System.out.println("y1");
        in2=input.nextDouble();
        System.out.println("x2");
        in3=input.nextDouble();
        System.out.println("y2");
        in4=input.nextDouble();
        tempA.x=in1;
        tempA.y=in2;
        tempB.x=in3;
        tempB.y=in4;
    }
    public void takeInputsSeries(){//prints prompts to ake in 3 numbers a,r,k and store them in instance variables
        Scanner input=new Scanner(System.in);

        System.out.println("a, first term: ");
        a=input.nextDouble();
        System.out.println("r, ratio: ");
        r=input.nextDouble();
        System.out.println("k, number of terms: ");
        k=input.nextInt();
    }
}