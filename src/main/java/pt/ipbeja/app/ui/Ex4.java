package pt.ipbeja.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pt.ipbeja.app.model.ButtonHandler;

public class Ex4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.ex4(primaryStage);
    }

    private void ex4(Stage primaryStage){
        Label label1 = new Label("0");
        Label label2 = new Label("0");

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        ButtonHandler buttonHandler1 = new ButtonHandler(label1,0);
        ButtonHandler buttonHandler2 = new ButtonHandler(label2,0);

        button1.setOnAction(buttonHandler1);
        button2.setOnAction(buttonHandler2);

        label1.setText(buttonHandler1.getLabelText());
        label2.setText(buttonHandler2.getLabelText());


        VBox vBox = new VBox();
        vBox.getChildren().addAll(button1,label1,button2,label2);

        Scene scene = new Scene(vBox,300,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
