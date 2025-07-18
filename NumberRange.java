import java.util.Scanner;

public class NumberRange{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num between 1-100: ");
        int num = sc.nextInt();
        sc.close();
        if(num>=1&&num<=50){ System.out.println("The number is in lower half");}
        else if(num>=51&&num<=100) {System.out.println("The number is in upper half");}
        else{ System.out.println("Invalid number");}
    }
}