import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.*;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("standard project start-up for JavaFX");
        primaryStage.initStyle(StageStyle.DECORATED);

        Scene scene = new Scene(new StackPane(), 300, 275);

        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
