package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    private String login;
    private String password;

    @FXML
    TextField loginField;

    @FXML
    PasswordField passwordField;

    public void btnStudentLogin(ActionEvent actionEvent) {
        login = loginField.getText();
        password = passwordField.getText();
        //У тебя есть логин и пароль студента используй их мудро.
    }

    public void btnTeacherLogin(ActionEvent actionEvent) {
        login = loginField.getText();
        password = passwordField.getText();
        //У тебя есть логин и пароль препода используй их мудро.
    }

    public void btnRegistration(ActionEvent actionEvent) {
        //Создание выскакивающего окошка с формой регистрации.
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/registration.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Регистрируйся блядь");
            stage.setMinWidth(250);
            stage.setMinHeight(294);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}


    }
}
