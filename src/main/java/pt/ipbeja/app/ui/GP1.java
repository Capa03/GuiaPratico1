package pt.ipbeja.app.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class GP1 extends Application {
    Button button1 = new Button("Button1");
    Button button2 = new Button("Button2");
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ButtonHandler buttonHandler = new ButtonHandler();

        //this.ex2(primaryStage,buttonHandler);
        this.ex4(primaryStage,buttonHandler);
    }

    private void ex2(Stage primaryStage){

        ButtonHandler buttonHandler = new ButtonHandler();
        this.button1.setOnAction(buttonHandler);
        this.button2.setOnAction(buttonHandler);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(this.button1,this.button2);
        Scene scene = new Scene(vBox,200,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void ex3(Stage primaryStage,ButtonHandler buttonHandler){

        this.button1.setOnAction(buttonHandler);
        this.button2.setOnAction(buttonHandler);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(this.button1,this.button2);
        Scene scene = new Scene(vBox,200,100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void ex4(Stage primaryStage,ButtonHandler buttonHandler){
        int counter = 0;
        Label label1 = new Label(String.valueOf(counter));
        Label label2 = new Label(String.valueOf(counter));
        this.button1.setOnAction(buttonHandler);
        this.button2.setOnAction(buttonHandler);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(this.button1,label1,this.button2,label2);
        Scene scene = new Scene(vBox,300,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    class ButtonHandler implements EventHandler<ActionEvent>{
        //TODO Add Constructor to pass the label
        @Override
        public void handle(ActionEvent actionEvent) {
            Button buttonClicked = (Button)(actionEvent.getSource());

            Alert alert = new Alert(Alert.AlertType.INFORMATION,buttonClicked.getText());
            alert.showAndWait();
        }
    }

}
