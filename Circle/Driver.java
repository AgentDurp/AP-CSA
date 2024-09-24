
/*Christopher Orban, Mon, Sept. 23, 2024 Problem set 2A
 * 
 */

public class Driver{
    
    public static void main(String[] args){
        Circle nonParameterCircle =new Circle();//circle object called nonParameterCircle without specific parameters
        nonParameterCircle.printResults();
        
        Circle parameterCircle=new Circle(5.0);//circle object with specific parameters
        parameterCircle.printResults();
        
        Cylinder nonParameterCylinder=new Cylinder();//cylinder object without specific parameters
        nonParameterCylinder.printResults();
        
        Cylinder parameterCylinder=new Cylinder(5.0,5.0);//cylinder object with specific parameters
        parameterCylinder.printResults();
    }
}