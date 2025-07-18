import java.util.Scanner;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println(num1 > num2 ? "Number 1 is greater" : "Number 2 is greater");
    }
}
