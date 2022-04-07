import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int userData;
        String userInput;

        userInput = JOptionPane.showInputDialog("введите число от 1 до 30");
        userData = Integer.parseInt(userInput);

        switch (userData){
            case 1:
                JOptionPane.showMessageDialog(null, "вы ввели число 1");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "вы ввели число 2");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "вы ввели число 3");
                break;

            default:
                JOptionPane.showMessageDialog(null, "вы ввели недопустимое число!");

        }
    }
}
