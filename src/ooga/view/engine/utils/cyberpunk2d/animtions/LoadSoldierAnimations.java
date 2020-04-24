package ooga.view.engine.utils.cyberpunk2d.animtions;

import ooga.view.engine.graphics.animation.Animation2D;

import java.util.Map;
import ooga.view.engine.graphics.animation.Animation2D;
import com.google.gson.internal.LinkedHashTreeMap;

public class LoadSoldierAnimations {

  final private static int fps = 18;

  final private static String DIR_PATH =  "/view/textures/2d/cyberpunk/nonplayable/Soldier/Individual_Sprites/";

  final private static String DIR_W = "W";
  final private static String DIR_E = "E";

  final private static String ATTACK = "ATTACK";
  final private static String DEATH = "DEATH";
  final private static String HURT = "HURT";
  final private static String FALL = "FALL";
  final private static String JUMP = "JUMP";
  final private static String IDLE = "IDLE";
  final private static String WALK = "WALK";

  public static Map<String, Animation2D> loadAnimations(){
    String mapKey;
    LinkedHashTreeMap soldierDict = new LinkedHashTreeMap<>();

    //load E animations
    mapKey = "E_ATTACK";
    soldierDict.put(mapKey, new Animation2D(8, fps, DIR_PATH, ATTACK));
    mapKey = "E_DEATH";
    soldierDict.put(mapKey, new Animation2D(15, fps, DIR_PATH, DEATH));
    mapKey = "E_FALL";
    soldierDict.put(mapKey, new Animation2D(4, fps, DIR_PATH, FALL));
    mapKey = "E_HURT";
    soldierDict.put(mapKey, new Animation2D(6, fps, DIR_PATH, HURT));
    mapKey = "E_IDLE";
    soldierDict.put(mapKey, new Animation2D(6, fps, DIR_PATH, IDLE));
    mapKey = "E_JUMP";
    soldierDict.put(mapKey, new Animation2D(6, fps, DIR_PATH, JUMP));
    mapKey = "E_WALK";
    soldierDict.put(mapKey, new Animation2D(9, fps, DIR_PATH, WALK));

    //TODO

    return soldierDict;


  }


}
