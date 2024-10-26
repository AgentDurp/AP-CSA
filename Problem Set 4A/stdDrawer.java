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

    public static void sierpinsky(){
        StdDraw.setScale(0,1);
        StdDraw.setPenRadius(.002);
        OrderedPair vert1=new OrderedPair(0,1);
        OrderedPair vert2=new OrderedPair(1,1);
        OrderedPair vert3=new OrderedPair(.5,0);
        OrderedPair ranPoint=new OrderedPair((int)Math.random(),(int)Math.random());
        double midx=0;
        double midy=0;
        int ranVert=(int)(Math.random()*3+1);
        //StdDraw.point(vert1.getX(),vert1.getY());
        //StdDraw.point(vert2.getX(),vert2.getY());
        //StdDraw.point(vert3.getX(),vert3.getY());
        for(int i=0;i<100000;i++){
            ranVert=(int)(Math.random()*3+1);
            System.out.println(ranVert);
            if(ranVert==1){
            midx=Function.findMidpoint(vert1,ranPoint).getX();
            midy=Function.findMidpoint(vert1,ranPoint).getY();
            StdDraw.point(midx,midy);

            }else if(ranVert==2){
            midx=Function.findMidpoint(vert2,ranPoint).getX();
            midy=Function.findMidpoint(vert2,ranPoint).getY();
            StdDraw.point(midx,midy);
            }else{
            midx=Function.findMidpoint(vert3,ranPoint).getX();
            midy=Function.findMidpoint(vert3,ranPoint).getY();
            StdDraw.point(midx,midy);
            }
            ranPoint.x=midx;
            ranPoint.y=midy;
        }
    }
}