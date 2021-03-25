import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Check extends Application {
    @Override
    public void start(Stage primaryStage) {
      Pane pane = new Pane();
        boolean isWhite =true;
        for (int i = 0; i < 8; i++) {
           for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle();

               rectangle.xProperty().bind(pane.widthProperty().multiply(i).divide(8));
               rectangle.yProperty().bind(pane.heightProperty().multiply(j).divide(8));
                rectangle.widthProperty().bind(pane.widthProperty().divide(8));
                rectangle.heightProperty().bind(pane.heightProperty().divide(8));
                rectangle.setStroke(Color.BLACK);

                rectangle.setFill(isWhite?Color.WHITE:Color.BLACK);

                isWhite = !isWhite;

                pane.getChildren().add(rectangle);
            }
            isWhite = !isWhite;
        }

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Lab");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
