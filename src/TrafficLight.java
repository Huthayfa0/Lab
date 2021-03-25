import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane=new BorderPane();
        VBox traffic=new VBox();
        traffic.setStyle("-fx-border-color: black;");
        traffic.setMaxWidth(80);
        traffic.setMaxHeight(120);
        traffic.setAlignment(Pos.CENTER);
        pane.setCenter(traffic);

        Circle red=new Circle(30);
        red.setFill(Color.RED);
        Circle yellow=new Circle(30);
        yellow.setFill(Color.YELLOW);
        Circle green=new Circle(30);
        green.setFill(Color.GREEN);
        traffic.getChildren().addAll(red,yellow,green);
        traffic.setSpacing(10);
        HBox radios=new HBox();
        RadioButton redRad=new RadioButton("Red");
        RadioButton yellowRad=new RadioButton("yellow");
        RadioButton greenRad=new RadioButton("green");
        radios.getChildren().addAll(redRad,yellowRad,greenRad);
        radios.setAlignment(Pos.CENTER);
        radios.setTranslateY(-10);
        traffic.setLayoutY(10);
        pane.setBottom(radios);
        Scene sc=new Scene(pane,300,300);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
