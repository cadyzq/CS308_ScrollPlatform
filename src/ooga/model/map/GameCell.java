package ooga.model.map;

import ooga.model.interfaces.gameMap.Cell;

public class GameCell implements Cell {
  private boolean walkable;
  @Override
  public void setState(int state) {

  }

  @Override
  public int getState() {
    return 0;
  }

  @Override
  public int getImage() {
    return 0;
  }

  @Override
  public void setImage(int imageIndex) {

  }

  @Override
  public int getUniqueID() {
    return 0;
  }

  @Override
  public boolean isMapCellWalkable() {
    return walkable;
  }

  @Override
  public void setWalkable(boolean walkable) {
    this.walkable = walkable;
  }
}
