 class Driver{
     public static void main(String[] args){
         System.out.println(Review.fakeReview("Review0.txt",2));
         System.out.println(Review.totalSentiment("Review0.txt"));
         System.out.println(Encoder.Caeser("this is a test",1));
         System.out.println(Decoder.Caeser(Encoder.Caeser("this is a test",1),1));
     }
 }