import java.util.Scanner;

public class GuessTheNumberTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100)+1;
        System.out.println("RN "+randomNum);
        int userNum;
        int guess =0;
            System.out.println("Guess the number");
            System.out.println("The generated number is between 1-100");

        do{
            System.out.print("Enter your number");
            userNum = sc.nextInt();
            guess++;
            if(userNum >randomNum){
                System.out.println("Too High!!!");
            }else{
                System.out.println("Too Low!!!");

            }
        }while(randomNum!=userNum);
                System.out.println("Win! you guessed in "+guess+" guesses");
    }
}