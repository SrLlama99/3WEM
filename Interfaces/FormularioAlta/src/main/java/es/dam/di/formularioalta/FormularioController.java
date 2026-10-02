package es.dam.di.formularioalta;

import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    }
    @FXML
    private void enviar() {
        List<String> errores = new ArrayList<>();
        String nombre = txtNombre.getText().trim();
        String correo = txtCorreo.getText().trim();
        LocalDate fecha = dpNacimiento.getValue();
        if (nombre.isEmpty()) {
            errores.add("Escribe tu nombre.");
        }
        if (!correo.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            errores.add("El correo electrónico no es válido.");
        }
        if (cbCiclo.getValue() == null) {
            errores.add("Elige un ciclo.");
        }
        if (fecha == null || !fecha.isBefore(LocalDate.now())) {
            errores.add("Indica una fecha de nacimiento anterior a hoy.");
        }
        if (!errores.isEmpty()) {
            mostrar(String.join("\n", errores), false);
            return;
        }
        RadioButton curso = (RadioButton) tgCurso.getSelectedToggle();
        mostrar("Inscripción registrada: " + nombre + " · " + curso.getText() + " " +
                cbCiclo.getValue()
                + " · " + spnModulos.getValue() + " módulos.", true);
    }
    @FXML
    private void limpiar() {
        txtNombre.clear();
        txtCorreo.clear();
        cbCiclo.setValue(null);
        rbPrimero.setSelected(true);
        dpNacimiento.setValue(null);
        spnModulos.getValueFactory().setValue(6);
        chkCondiciones.setSelected(false);
        lblResultado.setText("");
    }
    private void mostrar(String texto, boolean correcto) {
        lblResultado.setText(texto);
        lblResultado.setTextFill(correcto ? Color.web("#15803d") :
                Color.web("#b91c1c"));
    }
}