public class Person {
    public int haight = 180;
    public String name = "Defoult";

    public void say (String name){                    // метод say
        System.out.println("Hello! " + name);
    }

    public Person() {                                 // конструктор 1
    }

    public Person(int h) {                            // конструктор 2
        haight = h;
    }              // конструктор 2

    public Person(int h, String n) {                  // конструктор 3
        haight = h;
        name = n;
    }
}
