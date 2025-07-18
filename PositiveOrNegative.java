import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nummber");
        int num = sc.nextInt();
        sc.close();
        System.out.println(num > 0 ? "positive " : num < 0 ? "negative" : "zero");
    }
}
