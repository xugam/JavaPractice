import javax.swing.*;

public class GameLoop  {
    public static void main(String[] args) {
        JFrame f = new JFrame("Box ");
        Box box = new Box();
        f.add(box);
        f.setSize(500,500);
        f.setVisible(true);
        
    }
}
