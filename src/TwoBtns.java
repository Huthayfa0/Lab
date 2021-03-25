import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TwoBtns extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane=new VBox();
        pane.getChildren().addAll(new Button("OK"),new Button("Cancel"));
        Scene sc=new Scene(pane,100,100);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
