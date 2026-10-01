package es.dam.di.holajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Mi primera aplicación JavaFX funciona!");
    }

    @FXML
    protected void onLimpiarButtonClick() {
        welcomeText.setText("");
    }
}
