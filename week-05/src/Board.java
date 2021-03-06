import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  Area myGameArea;
  CurrentArea myCurrentArea;
  ArrayList<Character> charactersOnBoard;
  Hero myHero;
  Monster bossMonster;
  Skeleton skeleton1;
  Skeleton skeleton2;
  Skeleton skeleton3;

  public Board() {
    myGameArea = new Area();
    myCurrentArea = new CurrentArea(myGameArea);

    charactersOnBoard = new ArrayList<>();
    myHero = new Hero(myGameArea, myCurrentArea);
    charactersOnBoard.add(myHero);
    bossMonster = new Monster(myGameArea, myCurrentArea, myCurrentArea.randomPositionGenerator(charactersOnBoard));
    charactersOnBoard.add(bossMonster);
    skeleton1 = new Skeleton(myGameArea, myCurrentArea, myCurrentArea.randomPositionGenerator(charactersOnBoard));
    charactersOnBoard.add(skeleton1);
    skeleton2 = new Skeleton(myGameArea, myCurrentArea, myCurrentArea.randomPositionGenerator(charactersOnBoard));
    charactersOnBoard.add(skeleton2);
    skeleton3 = new Skeleton(myGameArea, myCurrentArea, myCurrentArea.randomPositionGenerator(charactersOnBoard));
    charactersOnBoard.add(skeleton3);


    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    //graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    myGameArea.drawArea(graphics);
    for (Character character : charactersOnBoard) {
      character.draw(graphics);
    }
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      myHero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    }
    // and redraw to have a new picture with the new coordinates
    //invalidate();
    repaint();
  }
}