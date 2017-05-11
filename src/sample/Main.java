package sample;

import IO.FileCreator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/login.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 360, 195));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);

        try {
            FileCreator file = new FileCreator();

        } catch(IOException e){
            e.printStackTrace();

            System.out.println("Cannot create files on the system");
            System.exit(-1);
        }
    }
}
