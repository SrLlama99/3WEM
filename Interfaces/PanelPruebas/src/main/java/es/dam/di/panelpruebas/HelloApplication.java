package es.dam.di.panelpruebas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new
                FXMLLoader(HelloApplication.class.getResource("panel-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Panel de pruebas · DI");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
