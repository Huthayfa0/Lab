import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane= new VBox();
        GridPane buttonsContainer=new GridPane();
        HBox main=new HBox();
        TextField txt=new TextField();
        pane.getChildren().addAll(txt, main);
        Button equal=new Button("=");
        Button[][] buttons={
                {new Button("7"), new Button("8"), new Button("9"), new Button("/")},
                {new Button("4"), new Button("5"), new Button("6"), new Button("*")},
                {new Button("1"), new Button("2"), new Button("3"), new Button("-")},
                {new Button("0"), new Button("."), new Button("C"), new Button("+")},
        };
        main.getChildren().addAll(buttonsContainer, equal);
        for (int i=0;i<buttons.length;i++)
            for (int j=0;j<buttons[i].length;j++)
                buttonsContainer.add(buttons[i][j],j,i);
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Lab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
