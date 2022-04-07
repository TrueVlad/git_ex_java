import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String[] bukvy = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        Arrays.sort(bukvy);

        System.out.print("Введите регион (1..199): ");
        Scanner in = new Scanner(System.in);

        int region = in.nextInt();

        try {
            System.setOut(new PrintStream(new File("Output.txt")));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //одинаковые буквы
        for (int i = 0; i < bukvy.length; i++) {
            //первые 2 нуля
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
            }

            //буквы и цифры
            for (int j = 111; j <= 999; j += 111) {
                System.out.printf("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
            }
        }

        //одинаковые цифры
        for (int i = 111; i <= 999; i += 111) {
            for (int j = 0; j < bukvy.length; j++) {
                for (int j2 = 0; j2 < bukvy.length; j2++) {
                    for (int k = 0; k < bukvy.length; k++) {
                        System.out.printf("%s%03d%s%02d\n", bukvy[j], i, bukvy[j2] + bukvy[k], region);
                    }
                }
            }
        }

        in.close();
    }
}
