import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        // final - просто константы | если final class то нет наследования | если final метод, то нет возможности переопределить в классах наследниках (не вызывается из наследников)

        Math a = new Math();
        System.out.println(Math.sum(2, 3));     // static метод, вызвали не создавая объект
        System.out.println(a.mult(2, 3));       // метод вызывается после создания объекта

        System.out.println("Переменная х внутри объекта а = " + a.x);      // до изменения переменной через класс

        Math.x = 24;             // так же меняется без объекта и меняется для всех объектов
        System.out.println("Переменная х меняем через класс и она становится : " +  Math.x);

        System.out.println("Переменная х внутри объекта а, после изменения переменной через класс = " + a.x);   // после изменения переменной через класс

        a.y = 15;                // только внутри объекта
        System.out.println("Переменная y внутри объекта а (присвоили 15) = " + a.y);

        Math b = new Math();
        System.out.println("Переменная y внутри объекта b (осталась 12)= " + b.y);


    }
}
