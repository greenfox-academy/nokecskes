/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

    int sizeOfSquare = 50;

    for (int i = 0; i < 3; i++) {
      int startX = randomNumberGenerator();
      int startY = randomNumberGenerator();
      drawSquare(startX, startY, sizeOfSquare, graphics);
    }
  }

  public static int randomNumberGenerator() {
    int random = (int) (Math.random() * 251);
    return random;
  }

  public static void drawSquare(int topLeftX, int topLeftY, int sizeOfSquare, Graphics graphics) {
    graphics.drawRect(topLeftX, topLeftY, sizeOfSquare, sizeOfSquare);
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
