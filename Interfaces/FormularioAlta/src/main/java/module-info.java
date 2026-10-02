module es.dam.di.formularioalta {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.dam.di.formularioalta to javafx.fxml;
    exports es.dam.di.formularioalta;
}