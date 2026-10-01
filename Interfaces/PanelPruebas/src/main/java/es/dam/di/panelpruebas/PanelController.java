package es.dam.di.panelpruebas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
public class PanelController {
    // Campos enlazados con los fx:id del FXML
    @FXML private TextField txtNombre;
    @FXML private Button btnSaludar;
    @FXML private Label lblSaludo;
    @FXML private ColorPicker cpColor;
    @FXML private Label lblContador;
    private int contador = 0;
    // Se ejecuta automáticamente después de cargar el FXML
    @FXML
    private void initialize() {
        btnSaludar.setDisable(true);
        cpColor.setValue(Color.BLACK);
// Oyente: se ejecuta cada vez que cambia el texto del campo
        txtNombre.textProperty().addListener((obs, anterior, nuevo) ->
                btnSaludar.setDisable(nuevo.isBlank()));
        actualizarContador();
    }
    // Manejadores de eventos asociados en el FXML con onAction="#..."
    @FXML
    private void saludar() {
        lblSaludo.setText("¡Hola, " + txtNombre.getText().trim() + "!");
    }
    @FXML
    private void cambiarColor() {
        lblSaludo.setTextFill(cpColor.getValue());
    }
    @FXML
    private void sumar() {
        contador++;
        actualizarContador();
    }
    @FXML
    private void restar() {
        if(contador > 0) {
            contador--;
        }
        actualizarContador();
    }
    @FXML
    private void reiniciar() {
        contador = 0;
        actualizarContador();
    }
    private void actualizarContador() {
        lblContador.setText(String.valueOf(contador));
    }

    @FXML
    private void mayusculas() {
        String textoActual = lblSaludo.getText();
        if (textoActual != null) {
            lblSaludo.setText(textoActual.toUpperCase());
        }
    }
}
