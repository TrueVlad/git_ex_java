import javafx.event.ActionEvent;

// http://www.javenue.info/post/36

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {           // наследуем из класса, который умеет создавать формы

    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("check", false);

    public SimpleGUI() {                                             // делаем конструктор
        super("Simple Example");                                // передаем в основной конструктор класса JFrame название формы
        this.setBounds(100, 100, 250, 100);        // передаем размеры в пикселях
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                             // когда закроем форму, все закроется

        Container container = this.getContentPane();                                      // создаем экземпляр контейнера
        container.setLayout(new GridLayout(3, 2, 2, 2));          // хз
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();    // группируем кнопки
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        radio1.setSelected(true);             // будет автоматически выбранна кнопка
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEvantListener());      // позволяет через кнопку вызвать класс
        container.add(button);
    }

    class ButtonEvantListener implements ActionListener {                // реализует интерфейс Actionlistener
//        public void actionPerformed (ActionEvent e){
//            String messege = "";
//            messege += "Button was pressed\n";
//            messege += "Text is " + input.getText() + "\n";
//            messege += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " Is selected \n";
//            messege += "CheckBox is " + ((check.isSelected()) ? "checked" : "unchecked");
//            JOptionPane.showMessageDialog(null, messege, "Output", JOptionPane.PLAIN_MESSAGE);
//        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
            String messege = "";
            messege += "Button was pressed\n";
            messege += "Text is " + input.getText() + "\n";
            messege += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " Is selected \n";
            messege += "CheckBox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, messege, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}

