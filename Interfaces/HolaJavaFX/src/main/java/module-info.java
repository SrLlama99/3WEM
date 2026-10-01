module es.dam.di.holajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.dam.di.holajavafx to javafx.fxml;
    exports es.dam.di.holajavafx;
}