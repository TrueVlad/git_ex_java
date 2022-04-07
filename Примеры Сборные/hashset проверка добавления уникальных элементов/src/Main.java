import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        for (String str : set)
            System.out.println(str);
        System.out.println(set.size());
    }
}
