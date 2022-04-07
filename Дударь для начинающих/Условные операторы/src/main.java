import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.println("Enter first num: ");
        first = num.nextInt();
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        isTrue = first == 51 ? true : false;               // если first = 51, то true иначе false (тернарный оператор)

//==============================================================================
        if (first >= second && isTrue) {                     // && - и; || - или
            System.out.println("first >= second");
            System.out.println("\n");
        }
        else if (first == 45)
            System.out.println("num is equal 45");
        else System.out.println("Else");

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        switch (first) {
            case 51:                                                          // аналог if
                System.out.println("num is equal 51");
                break;
            case 48:
                System.out.println("num is equal 48");
                break;
            case 42:
                System.out.println("num is equal 42");
                break;
            default:                                                    // аналог else
                System.out.println("num is equal something");
        }
    }
}
