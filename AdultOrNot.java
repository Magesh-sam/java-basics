import java.util.Scanner;

public class AdultOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age > 18 ? "you're an adult" : "you're not an adult");
        sc.close();
    }
}