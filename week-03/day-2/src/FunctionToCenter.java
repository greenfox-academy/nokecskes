/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static final int canvasSize = 300;
  public static final int canvasStart = 0;

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    for (int i = 0; i < (canvasSize + 1); i += 20) {
      drawLineToCenter(i, canvasStart, graphics);
      drawLineToCenter(i, canvasSize, graphics);
      drawLineToCenter(canvasStart, i, graphics);
      drawLineToCenter(canvasSize, i, graphics);
    }
  }

  public static void drawLineToCenter (int startX, int startY, Graphics graphics) {
    graphics.drawLine(startX, startY, canvasSize / 2, canvasSize / 2);
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
