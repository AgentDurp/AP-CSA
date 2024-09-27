 class OrderedPair{
    double x,y;
    OrderedPair(){
        x=0;
        y=0;
    }

    OrderedPair(double n1,double n2){
        x=n1;
        y=n2;
    }

    public String toString(){
        return "["+x+","+y+"]";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

}