/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.

    for (int i = 0; i < 3 ; i++) {
      int startX = (int)(Math.random()* 300);
      int startY = (int)(Math.random()* 300);
      drawHorizontalLine(startX, startY, graphics);
    }
  }

  public static void drawHorizontalLine(int StartX, int StartY, Graphics graphics){
    int direction = calculateDirection();
    graphics.drawLine(StartX, StartY, StartX + (50 * direction), StartY);
  }

  public static int calculateDirection(){
    double random = Math.random();
    int direction = 0;

    if(random < 0.5){
      direction = 1;
    }
    else{
      direction = -1;
    }

    return direction;
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}