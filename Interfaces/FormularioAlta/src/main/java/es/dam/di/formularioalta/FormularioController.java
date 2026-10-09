package es.dam.di.formularioalta;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FormularioController {
    @FXML private TextField txtNombre;
    @FXML private TextField txtCorreo;
    @FXML private ComboBox<String> cbCiclo;
    @FXML private ToggleGroup tgCurso;
    @FXML private RadioButton rbPrimero;
    @FXML private DatePicker dpNacimiento;
    @FXML private Spinner<Integer> spnModulos;
    @FXML private CheckBox chkCondiciones;
    @FXML private Button btnEnviar;
    @FXML private Label lblResultado;
    @FXML
    private void initialize() {
// Configuración que Scene Builder no permite hacer: se hace en código
        cbCiclo.getItems().addAll("DAM", "DAW", "ASIR", "SMR");
        spnModulos.setValueFactory(new
                SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8, 6));
// Enviar solo se activa si se aceptan las condiciones (binding)
        btnEnviar.disableProperty().bind(chkCondiciones.selectedProperty().not());
        cpPrimario.setValue(Color.web("#5a4fcf"));
    }
    @FXML
    private void enviar() {
        List<String> errores = new ArrayList<>();
        String nombre = txtNombre.getText().trim();
        String correo = txtCorreo.getText().trim();
        LocalDate fecha = dpNacimiento.getValue();
        RadioButton curso = (RadioButton) tgCurso.getSelectedToggle();
        boolean nombreMal = nombre.isEmpty();
        boolean correoMal = !correo.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+");
        boolean cicloMal = cbCiclo.getValue() == null;
        boolean fechaMal = fecha == null || !fecha.isBefore(LocalDate.now());

        if (nombreMal) errores.add("Escribe tu nombre.");
        if (correoMal) errores.add("El correo electrónico no es válido.");
        if (cicloMal) errores.add("Elige un ciclo.");
        if (fechaMal) errores.add("Indica una fecha de nacimiento anterior a hoy.");

        if (errores.isEmpty()){
            mostrar("Inscripción registrada: " + nombre + " · " + curso.getText() + " " + cbCiclo.getValue()
                    + " · " + spnModulos.getValue() + " módulos.", true);
        } else {
            String err ="";
            for (String ers : errores){
                err += "\n"+ers;
            }
            mostrar(err, false);
        }

        marcar(txtNombre, nombreMal);
        marcar(txtCorreo, correoMal);
        marcar(cbCiclo, cicloMal);
        marcar(dpNacimiento, fechaMal);



    }
    @FXML
    private void limpiar() {
        txtNombre.textProperty().addListener((obs, antes, ahora) -> marcar(txtNombre, false));
        txtCorreo.textProperty().addListener((obs, antes, ahora) -> marcar(txtCorreo, false));
        cbCiclo.valueProperty().addListener((obs, antes, ahora) -> marcar(cbCiclo, false));
        dpNacimiento.valueProperty().addListener((obs, antes, ahora) -> marcar(dpNacimiento, false));

    }
    private void mostrar(String texto, boolean correcto) {
        lblResultado.setText(texto);
        lblResultado.getStyleClass().removeAll("mensaje-ok", "mensaje-error");
        lblResultado.getStyleClass().add(correcto ? "mensaje-ok" : "mensaje-error");
    }

    private void marcar(Control campo, boolean conError) {
        campo.getStyleClass().remove("campo-error");
        if (conError) {
            campo.getStyleClass().add("campo-error");
        }
    }

    @FXML private BorderPane raiz;
    @FXML private ColorPicker cpPrimario;
    @FXML private ToggleButton tgbOscuro;

    @FXML
    private void cambiarColor() {
        Color c = cpPrimario.getValue();
        String hex = String.format("#%02x%02x%02x",
                Math.round(c.getRed() * 255), Math.round(c.getGreen() * 255), Math.round(c.getBlue() * 255));
        // Estilo en línea: redefine la variable de color para toda la ventana
        raiz.setStyle("-color-primario: " + hex + ";");
    }

    @FXML
    private void cambiarTema() {
        String oscuro = HelloApplication.class.getResource("oscuro.css").toExternalForm();
        if (tgbOscuro.isSelected()) {
            raiz.getStylesheets().add(oscuro);
        } else {
            raiz.getStylesheets().remove(oscuro);
        }
    }


}