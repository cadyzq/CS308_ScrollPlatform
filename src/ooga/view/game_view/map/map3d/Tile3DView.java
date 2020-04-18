package ooga.view.game_view.map.map3d;

import ooga.view.engine.maths.Vector3f;
import ooga.view.engine.objects.GameObject;
import ooga.view.engine.utils.cyberpunk3d.LoadCyberpunkModels;
import ooga.view.game_view.map.interfaces.TileView;

public class Tile3DView extends TileView {

  public Tile3DView(String type, Vector3f rot, Vector3f pos, Vector3f scale){
    this.mesh = LoadCyberpunkModels.getTileMesh(type);
    this.object = new GameObject(pos, rot, scale, mesh);
  }

}