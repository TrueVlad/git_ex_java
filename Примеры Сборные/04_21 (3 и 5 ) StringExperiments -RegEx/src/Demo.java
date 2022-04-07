import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    private Pattern pattern,pattern2;
    private Matcher m;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0_9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

    public Demo(){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    boolean checkEmail(String email){
        m = pattern.matcher(email);
        return m.matches();
    }

    public static void main(String[] args){
        Demo d = new Demo();
        System.out.print(d.checkEmail("demo@mail.ru"));

    }
}
