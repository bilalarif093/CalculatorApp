import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Demo program for Jframe");
        frame.setBounds(500,100,400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("C:\\Users\\Bilal Arif\\Desktop\\IdeaProjects\\calculatorApp\\src\\calculator.png");
        frame.setIconImage(image.getImage());

        JTextField textField = new JTextField();
        textField.setBounds(50,60,100,50);
        textField.setText("Enter number1");

        JTextField textField2 = new JTextField();
        textField2.setBounds(155,60,100,50);
        textField2.setText("Enter number2");




        //JButton

        JButton btn = new JButton();
        btn.setText("+");
        JButton btn1 = new JButton();
        btn1.setText("-");
        btn1.setBounds(100,0,100,50);
        btn.setBounds(0,0,100,50);
        btn.setFocusable(false);
        //event handling
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField.getText());
                double num2= Double.parseDouble(textField2.getText());
                double res = num1+num2;
                JOptionPane.showMessageDialog(null,"result = "+res);

            }
        });
        frame.add(btn1);
        frame.add(btn);
        frame.add(textField);
        frame.add(textField2);



    }
}