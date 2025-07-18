import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
	System.out.print("Enter second number: ");
	int num2 = sc.nextInt();
	int result = num1+num2;
	sc.close();
        System.out.println("Sum of two number is "+result);
    }
}
