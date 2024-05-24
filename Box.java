import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel{
    private Rectangle[] boxes = new Rectangle[40];
    Random r = new Random();
    Box(){
        super(); // calls the constructor of Jpanel
        for(int i=0; i<boxes.length;i++){
            boxes[i] = new Rectangle(r.nextInt(400),r.nextInt(400),30,30);
        }
    }

    public void paintComponent(Graphics g){
        
        for(int i=0; i<boxes.length;i++){
            g.setColor(Color.BLUE);
            g.fillRect(boxes[i].x+1,boxes[i].y+1,20,20);
            //g.setColor(Color.BLACK);
            g.fillOval(boxes[i].x,boxes[i].y,50,30);
        }
        
    }
}