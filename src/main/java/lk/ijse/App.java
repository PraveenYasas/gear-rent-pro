package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/login.fxml"))));
        stage.setTitle("GearRent Pro");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// To run the application, use the following command:
// mvn clean javafx:run
