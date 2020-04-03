package ooga;

import controller.MenuControl;
import controller.gamecontrol.GameController;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Main extends Application {

  private static final String TITLE = "Zelda";

  private GameController myGameControl;
  private MenuControl myMenuControl;
  //private Model myModel;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage currentStage) {
    //myModel = new Model();
    //myControl = new MainController(myModel);
    myMenuControl = new MenuControl(currentStage);
    Button start = myMenuControl.getMyStartButton();
    Button exit = myMenuControl.getMyStartButton();
    exit.setOnAction(e->currentStage.close());
    Scene myScene = myMenuControl.getScene();

    currentStage.setScene(myScene);
    currentStage.setTitle(TITLE);
    currentStage.setWidth(1070);
    currentStage.setHeight(820);
    currentStage.setResizable(true);
    currentStage.show();
  }

}
