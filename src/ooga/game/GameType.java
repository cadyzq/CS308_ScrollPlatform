package ooga.game;

import ooga.model.characters.MarioPlayer;
import ooga.model.characters.ZeldaPlayer;

public enum  GameType {
  MARIO(0),
  ZELDA(1),
  ;

  private final int index;

  GameType(int index) {
    this.index = index;
  }
  public int getIndex() {
    return this.index;
  }

  public static GameType byIndex(int index) {
    for (GameType g : GameType.values()) {
      if (g.index == index) {
        return g;
      }
    }
    return null;
  }
}
