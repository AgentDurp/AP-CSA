import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        int player=-1;

        boolean won=false;
        String[][] nums=new String[3][3];
        for(int i=0;i<nums.length;i++){
            for(int z=0;z<nums[0].length;z++){
                nums[i][z]=" ";
            }
        }
        while(!won){
            
            printBoard(nums);
            won=checkWinState(nums);
            System.out.println(won);
            player=playerIn(nums,player);
        }
    }
    
    public static void printBoard(String[][] nums){
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[0].length;col++){
                System.out.print("["+nums[row][col]+"]");
            }
            System.out.println();
        }
    }

    public static int playerIn(String[][] nums, int player){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] split=input.split(",");
        int[] coords=new int[2];
        for(int i=0;i<split.length;i++){
            coords[i]=Integer.parseInt(split[i]);
        }
        System.out.println(player);
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

    public static boolean checkWinState(String[][] nums){
        boolean won=false;
        for(int row=0;row<nums.length;row++){
            if(nums[row][0].equals(nums[row][1])&&nums[row][1].equals(nums[row][2])){
                if(!nums[row][0].equals(" ")&&!nums[row][1].equals(" ")&&!nums[row][2].equals(" ")){
                    won=true;
                }
            }
            if(nums[0][row].equals(nums[1][row])&&nums[1][row].equals(nums[2][row])){
                if(!nums[0][row].equals(" ")&&!nums[1][row].equals(" ")&&!nums[2][row].equals(" ")){
                    won=true;
                }
            }
        }
        if(nums[0][0].equals(nums[1][1])&&nums[1][1].equals(nums[2][2])){
            if(!nums[0][0].equals(" ")&&!nums[1][1].equals(" ")&&!nums[2][2].equals(" ")){
                won=true;
            }
        }
        if(nums[0][2].equals(nums[1][1])&&nums[1][1].equals(nums[2][0])){
            if(!nums[0][2].equals(" ")&&!nums[1][1].equals(" ")&&!nums[2][0].equals(" ")){
                won=true;
            }
        }
        return won;
    }
}