public class main {
    public static void main(String[] args) {           //всегда должна быть эта функция

        Person vitya = new Person(120);
        vitya.haight = 122;
        System.out.println(vitya.haight);
        System.out.println("-----------");

        Person vlad = new Person();
        System.out.println(vlad.haight);
        vlad.say("Masha");
        System.out.println("-----------");

        Person gosha = new Person(120);
        System.out.println(gosha.haight);
        System.out.println("-----------");

        Person dima = new Person(120, "Dimitry");
        System.out.println(dima.name);
        System.out.println("-----------");

/////////////////////////////////////////////////////////////////////////////// наследование
        System.out.println("наследование");
        Student freshman = new Student();
        System.out.println(freshman.haight + " " + freshman.name + " " + freshman.course);
        System.out.println("-----------");

        Student freshman2 = new Student(4,180,"Julia");
        System.out.println(freshman2.haight + " " + freshman2.name + " " + freshman2.course);
        System.out.println("-----------");

        freshman2.name = "Alisa";
        System.out.println(freshman2.haight + " " + freshman2.name + " " + freshman2.course);
        System.out.println("-----------");

        freshman2.tell();
    }
}
