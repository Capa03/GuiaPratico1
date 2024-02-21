package pt.ipbeja.app.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ButtonHandler implements EventHandler<ActionEvent> {

    private Label label;
    private int counter;

    public ButtonHandler(Label label, int counter) {
        this.label = label;
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getLabelText() {
        return label.getText();
    }

    public Label getLabel() {
        return label;
    }

    public void setLabelText(String labelText) {
        this.label.setText(labelText);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Button buttonClicked = (Button) (actionEvent.getSource());

        if (this.getLabel() != null) {
            this.setCounter(++counter);
            this.setLabelText(String.valueOf(this.getCounter()));
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, buttonClicked.getText());
            alert.showAndWait();
        }

    }
}
