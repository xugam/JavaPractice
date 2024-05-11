import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Notepad {
    Notepad(){
        JFrame f = new JFrame("Notepad");
        f.setSize(1000,600);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("file");
        JMenu edit = new JMenu("Edit");
        JMenu format = new JMenu("Format");
        JMenu view = new JMenu("View");
        JMenu help = new JMenu("Help");

        f.setBackground();

        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args){
        new Notepad();
    }
}
