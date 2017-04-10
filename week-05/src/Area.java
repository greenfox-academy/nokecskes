import java.awt.Graphics;
import java.util.ArrayList;

public class Area extends GameObject {

  int[][] area;
  ArrayList<ArrayList<Tile>> boardTiles;
  ArrayList<Tile> rowOfTiles;

  public Area() {
    area = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};

    boardTiles = new ArrayList<ArrayList<Tile>>();
    rowOfTiles = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (area[i][j] == 0) {
          EmptyTile tile = new EmptyTile(0 + (j * 72), 0 + (i * 72));
          rowOfTiles.add(tile);
        } else if (area[i][j] == 1) {
          NotEmptyTile tile = new NotEmptyTile(0 + (j * 72), 0 + (i * 72));
          rowOfTiles.add(tile);
        }
      }
      boardTiles.add(rowOfTiles);
    }
  }

  @Override
  public void draw(Graphics graphics) {
    for (ArrayList<Tile> tiles : boardTiles) {
      for (Tile tile : tiles) {
        tile.draw(graphics);
      }
    }
  }
}
