public class Student extends Person {                 // наследник класса Person
    int course = 1;

    public Student(){
    }

    public Student(int c, int h, String n){
//        course = c;
//        name = n;
//        haight = h;
        super(h, n);                               //!!!!!! нужно так задействует конструктор
        course = c;
    }

    void tell(){
        System.out.println(super.name);              // super, берет переменные из класса наследованния из класса
        System.out.println(super.haight);
        System.out.println(course);
    }
}
