public class stdDrawer{
    stdDrawer(){
        
    }
    public static void grid(){
        StdDraw.setScale(0,500);
        int i=0;
        while(i<500){
            StdDraw.line(0,i,500,i);
            StdDraw.line(i,0,i,500);
            i+=20;
        }
    }
    public static void curve(){
        StdDraw.setScale(0,500);
        int i=0;
        while(i<500){
            StdDraw.line(i,500,0,0);
            StdDraw.line(0,500-i,500,500);
            i+=20;
        }
    }
    public static void circles(){
       StdDraw.setScale(0,500);
       int i=500;
       StdDraw.setPenRadius(.02);
       while(i>0){
           StdDraw.circle(250,250,i);
           i-=20;
       }
    }
}