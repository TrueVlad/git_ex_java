import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        int first, second, result;
        System.out.println("Enter first number");
        first = num.nextInt();
        System.out.println("Enter second number");
        second = num.nextInt();
        result = first+second;
        System.out.println("Result is: " + result);
    }
}
