import java.util.Random;
import java.util.Scanner;
public class RockPaperSciccor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int user=sc.nextInt();

        Random random=new Random();
        int Computer= random.nextInt(3);

        if(user==Computer){
            System.out.println("draw");
        }else if(user==0 && Computer==2 || user==1 && Computer==0 || user==2 && Computer==1){
            System.out.println("Win");
        }else{
            System.out.println("lose");
        }
        if(Computer==0){
            System.out.println("Computer Choice: Rock");
        }else if(Computer==1){
            System.out.println("Computer Choice: Paper");
        }else {
            System.out.println("Computer Choice: Scissor");
        }
    }
}

