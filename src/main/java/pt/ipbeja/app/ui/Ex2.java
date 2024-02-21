package pt.ipbeja.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pt.ipbeja.app.model.ButtonHandler;


public class Ex2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.ex2(primaryStage);
    }

    private void ex2(Stage primaryStage) {
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        ButtonHandler buttonHandler = new ButtonHandler(null, 0);
        button1.setOnAction(buttonHandler);
        button2.setOnAction(buttonHandler);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(button1, button2);
        Scene scene = new Scene(vBox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
