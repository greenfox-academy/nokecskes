/**
 * Created by Connor on 2017.03.28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static final int canvasMin = 0;
  public static final int canvasMax = 300;

  public static void LinePlay(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

    graphics.setColor(new Color(138,43,226));
    drawLinetoNeighborEdge(canvasMin, canvasMin, graphics);



  }

  public static void drawLinetoNeighborEdge(int startX, int startY, Graphics graphics) {
    for (int i = 0; i < 301 ; i += 20) {
      graphics.drawLine(startX + i, startY, canvasMax, canvasMin + i);
    }
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
