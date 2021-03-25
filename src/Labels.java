import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Labels extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField("javafx");
        TextField colSize = new TextField();
        textField.setAlignment(Pos.CENTER);
        colSize.setAlignment(Pos.CENTER);

        HBox hbUp = new HBox(5);
        hbUp.setAlignment(Pos.CENTER);
        hbUp.getChildren().addAll(new Label("Text Field"),
                textField);

        HBox hbDown = new HBox(5);
        hbDown.setAlignment(Pos.CENTER);
        RadioButton rbLeft = new RadioButton("Left");
        RadioButton rbCenter = new RadioButton("Center");
        RadioButton rbRight = new RadioButton("Right");
        hbDown.getChildren().addAll(rbLeft, rbCenter, rbRight);
        hbDown.getChildren().addAll(new Label("Column Size"),
                colSize);

        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(hbUp, hbDown);

        Scene scene = new Scene(vBox);
        primaryStage.setTitle("Labels");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
