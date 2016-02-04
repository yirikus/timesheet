package cz.yirikus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class
 *
 */
public class App extends Application {
    public static void main( String[] args ) {
        Application.launch(App.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
}
