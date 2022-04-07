package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//    int temp = func(3,4);
//        System.out.println(temp);

        int a[] = readArray();                      // вызываем метод и записываем его в другой массив
        for (int i = 0; i < a.length; i++)          // выводим записанный массив
        System.out.println(a[i]);
    }

    public static int[] readArray () {
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        return arr;
    }

    public static int func(int a, int b){              // возводим в степень
    int result = 1;
    for (int i = 0; i < b; i++)
        result *= a;
    return result;
    }
}
