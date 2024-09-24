public class Cylinder{
    double height;
    Circle base;
    Cylinder(){
        height=1;
        base=new Circle();
    }
    Cylinder(double r,double h){
        height=h;
        base=new Circle(r);
    }
    public String toString(){
        
        return "Hello, I am a cylinder with a radius of "+base.getRadius()+" and height of "+ height;
    }
    public double getRadius(){
    return base.getRadius();
    }
    public double getHeight(){
        return height;
    }
    public double surfaceArea(){
        //2πr(r + h)
    return(2*Math.PI*base.getRadius()*(base.getRadius()+height));
    }
    public double volume(){
        //π r² h
    return(Math.PI*Math.pow(base.getRadius(),2)*height);
    }
    //method that prints some of the results from methods listed above
    public void printResults(){
        System.out.println(toString());
        System.out.println("radius: "+getRadius());
        System.out.println("height: "+getHeight());
        System.out.println("surface area: "+surfaceArea());
        System.out.println("volume: "+volume()+"\n");
    }
}