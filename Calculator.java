import javax.swing.*;
import java.awt.event.*;
public class Calculator {
     public static void main(String []args)
    {
        JFrame f1=new JFrame("Calculator");
        f1.setSize(1200,700);

        JTextField num1=new JTextField();
        JTextField num2=new JTextField();
        JTextField result=new JTextField("Result");

        JLabel operator = new JLabel("                     ");
        JLabel number1 = new JLabel("Number1");
        JLabel number2 = new JLabel("Number2");
        JLabel equalsto = new JLabel("=");

        JButton subtract=new JButton("Subtraction(-)");
        JButton addition=new JButton("Addition(+)");
        JButton division=new JButton("Division(/)");
        JButton multiplication=new JButton("Multiplication(*)");
        
        number1.setBounds(200,50,100,30);
        number2.setBounds(550,50,100,30);
        num1.setBounds(150,100,200,50);
        operator.setBounds(370,100,100,50);
        equalsto.setBounds(750,100,100,50);
        num2.setBounds(500,100,200,50);
        result.setBounds(850,100,200,50);
        addition.setBounds(100,250,100,30);
        subtract.setBounds(300,250,100,30);
        division.setBounds(500,250,100,30);
        multiplication.setBounds(700,250,150,30);

        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int i = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
                 result.setText("          "+ i);
                 operator.setText("                     +");
            }

        });

        subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int i = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
                 result.setText("          "+ i);
                 operator.setText("                     -");
            }

        });

        multiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int i = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
                 result.setText("          "+ i);
                 operator.setText("                     *");
            }

        });

        division.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int i = Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText());
                 result.setText("          "+ i);
                 operator.setText("                     /");
            }

        });

        f1.add(number1);
        f1.add(number2);
        f1.add(num1);
        f1.add(num2);
        f1.add(addition);
        f1.add(operator);
        f1.add(equalsto);
        f1.add(result);
        f1.add(subtract);
        f1.add(multiplication);
        f1.add(division);
      
       f1.setLayout(null);
       f1.setVisible(true);
    }
}
