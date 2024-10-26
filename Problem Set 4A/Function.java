public class Function{
    Function(){
        
    }
        public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        //finds the midpoint between 2 points A, and B
        return new OrderedPair((A.x+B.x)/2,(A.getY()+B.getY())/2);
    }
}