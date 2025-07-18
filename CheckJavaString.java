import java.util.Scanner;

public class CheckJavaString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        sc.close();
        if(userInput.contains("java")){
            System.out.println("The string contains Java");
        }else{
            System.out.println("The string doesn't contain Java");

        }
    }
}