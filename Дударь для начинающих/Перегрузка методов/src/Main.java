public class Main {
    public static void main(String[] args) {
        System.out.println(summ(2, 3));
        System.out.println(summ(1,2,3));
        System.out.println(summ(2.3f,3.5f, 2.3f));
    }

    public static int summ (int a, int b){                 // одно имя метода, но возможность вызова с разными параметрами
        return a+b;
    }

    public static int summ (int a, int b, int c){
        return a+b+c;
    }

    public static float summ (float a, float b, float c){
        return a+b+c;
    }
}
