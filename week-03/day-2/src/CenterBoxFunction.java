/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    for (int i = 0; i < 3 ; i++) {
      int squareSize = randomNumberGenerator();
      drawSquare(squareSize, graphics);
    }
  }

  public static int randomNumberGenerator() {
    int random = (int) (Math.random() * 300);
    return random;
  }

  public static void drawSquare(int squareSize, Graphics graphics) {
    int startPoint = 150 - (squareSize / 2);
    graphics.drawRect(startPoint, startPoint, squareSize, squareSize);
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
