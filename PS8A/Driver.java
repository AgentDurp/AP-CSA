/*AP CSA
 *Christopher Orban, Dec 6th 2024
 * 
 */

import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        int player=-1;
        int won=0;
        int round=0;
        boolean playAgain=true;
        Scanner in=new Scanner(System.in);
        String[][] nums=new String[3][3];//the board
        while(playAgain){
            nums=initializeBoard(nums);
            while(checkWinState(nums)==0){//plays the game. not much point in making this another method imo
                round++;
                System.out.println(round);
                printBoard(nums);
                player=playerIn(nums,player);
                if(won!=0){//if a player has won, stop playing
                    break;
                }
            }
            won=checkWinState(nums);
            printBoard(nums);
            System.out.println("player "+won+" won");
            System.out.println("Do you want to play again? Y/N");
             if(in.nextLine().equals("N")){
                playAgain=false;
            }
            nums=initializeBoard(nums);
            round=0;
        }
        System.exit(0);
    }
    public static void printBoard(String[][] nums){
        //prints the current board state
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[0].length;col++){
                System.out.print("["+nums[row][col]+"]");
            }
            System.out.println();
        }
    }

    public static int playerIn(String[][] nums, int player){
        //takes player coordinate input and places an X or O depending on whos turn it is 
        //returns which player it is so that the main method knows 
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] split=input.split(",");
        int[] coords=new int[2];
        for(int i=0;i<split.length;i++){
            coords[i]=Integer.parseInt(split[i]);
        }
        while(nums[coords[0]][coords[1]].equals(" ")){

            if(player==-1){
                nums[coords[0]][coords[1]]="X";
                player*=-1;
            }else if(player==1){
                nums[coords[0]][coords[1]]="O";  
                player*=-1;
            }
        }
        return player;
    }

    public static int checkWinState(String[][] nums){
        int won=0;
        //won represents the player who has won, if its 0 the game continues, if 1 X's one, if 2 O's won
        //returns int won
        for(int row=0;row<nums.length;row++){//a loop to check vertical and horizontal win conditions
            if(nums[row][0].equals(nums[row][1])&&nums[row][1].equals(nums[row][2])){
                if(!nums[row][0].equals(" ")&&!nums[row][1].equals(" ")&&!nums[row][2].equals(" ")){
                    if(nums[row][0].equals("X")){
                        won=1;
                    }else{
                        won=2;
                    }
                }
            }
            if(nums[0][row].equals(nums[1][row])&&nums[1][row].equals(nums[2][row])){
                if(!nums[0][row].equals(" ")&&!nums[1][row].equals(" ")&&!nums[2][row].equals(" ")){
                    if(nums[0][row].equals("X")){
                        won=1;
                    }else{
                        won=2;
                    }
                }
            }
        }
        //diagonal win check
        if(nums[0][0].equals(nums[1][1])&&nums[1][1].equals(nums[2][2])){
            if(!nums[0][0].equals(" ")&&!nums[1][1].equals(" ")&&!nums[2][2].equals(" ")){
                if(nums[1][1].equals("X")){
                    won=1;
                }else{
                    won=2;
                }
            }
        }
        //diagonal win check
        if(nums[0][2].equals(nums[1][1])&&nums[1][1].equals(nums[2][0])){
            if(!nums[0][2].equals(" ")&&!nums[1][1].equals(" ")&&!nums[2][0].equals(" ")){
                if(nums[1][1].equals("X")){
                    won=1;
                }else{
                    won=2;                
                }
            }
        }
        return won;
    }

    public static String[][] initializeBoard(String[][] nums){
        //takes a 2d string array returns the array full of spaces
        for(int i=0;i<nums.length;i++){
            for(int z=0;z<nums[0].length;z++){
                nums[i][z]=" ";
            }
        }
        return nums;
    }
}