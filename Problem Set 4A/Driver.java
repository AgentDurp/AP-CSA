import java.util.Scanner;
class Driver{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /**
        int ranNum=(int)(Math.random()*100)+1;
        int guessAmt=0;
        System.out.println("I'm thinking of a number between 1 and 100");
        int numIn=in.nextInt();
        while(numIn!=ranNum){
        if(ranNum>numIn){
        System.out.println("Nope, that's too low");
        numIn=in.nextInt();
        guessAmt++;
        }else{
        System.out.println("Nope, that's too high");
        numIn=in.nextInt();
        guessAmt++;
        }
        }
        if(numIn==ranNum){
        System.out.println("You guessed it!, it took you "+guessAmt+" tries");
        }
         */
        //stdDrawer.grid();
        //stdDrawer.curve();
        stdDrawer.circles();

    }
}