public class Circle{
    double radius;
    //constructor with a set radius of 1
    Circle(){
        radius=1;
    }
    //constructor with a variable radius of r
    Circle(double r){
        radius=r;
    }
    //method that returns a string with the radius of the circle
    public String toString(){
    return"Hello, I am a circle with a radius of "+radius;
    }
    //method that returns the raidus of the circle
    public double getRadius(){
    return radius;
    }
    //method that returns the circumfrence of the circle
    public double circumference(){
        return(2*Math.PI*radius);
    }
    //method that returns the area of the circle
    public double area(){
        return(Math.PI*Math.pow(radius,2));
    }
    //method that prints some of the results from methods listed above
    public void printResults(){
        System.out.println(toString());
        System.out.println("radius: "+getRadius());
        System.out.println("circumfrence: "+circumference());
        System.out.println("area: "+area()+"\n");
    }
}