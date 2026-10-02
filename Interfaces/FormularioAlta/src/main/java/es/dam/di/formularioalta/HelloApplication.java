package es.dam.di.formularioalta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new
                FXMLLoader(HelloApplication.class.getResource("formulario-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Inscripción · DI");
        stage.setScene(scene);
        stage.show();
    }

}
