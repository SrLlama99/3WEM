module es.dam.di.panelpruebas {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.dam.di.panelpruebas to javafx.fxml;
    exports es.dam.di.panelpruebas;
}