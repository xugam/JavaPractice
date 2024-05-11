import javax.swing.*;
import java.awt.event.*;
class Swing
{
    public static void main(String []args)
    {
        JFrame f1=new JFrame("Java");
        f1.setSize(500,400);
        JLabel lb1=new JLabel("login");
        JLabel lb2=new JLabel("password");
        lb1.setBounds(60,100,90,30);
        lb2.setBounds(60,150,90,30);
        JTextField tx1=new JTextField(" Ram Rai");
        JTextField tx2=new JTextField("*******");
        JTextField tx3=new JTextField();
        tx1.setBounds(150,100,100,30);
        tx2.setBounds(150,150,100,30);
        tx3.setBounds(170,200,70,30);
        JButton b=new JButton("click");
        b.setBounds(170,250,100,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
             tx3.setText("Welcome");
            }
        });
        f1.add(b); f1.add(lb1); f1.add(lb2); f1.add(tx1); f1.add(tx2); f1.add(tx3);
       f1.setLayout(null);
       f1.setVisible(true);
    }
}