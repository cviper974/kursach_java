package sample;

import IO.DBOperations;
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
        if(loginField.getText().equals("") || passwordField.getText().equals("")){
            System.out.println("Blyad");
        }

        if (DBOperations.loginCheckStudent(loginField.getText(), passwordField.getText())) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("../fxml/studentMainMenu.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Главное меню");
                stage.setScene(new Scene(root, 1166, 835));
                stage.setResizable(false);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("GTFO"); // сделай чёто, если логин не прошёл
        }
    }

    public void btnTeacherLogin(ActionEvent actionEvent) {
        if (DBOperations.loginCheckTeacher(loginField.getText(), passwordField.getText())){
            System.out.println("YAYA");
        } else{
            System.out.println("YAY");
        }
    }

    public void btnRegistrationAsStudent(ActionEvent actionEvent) {
        //Создание выскакивающего окошка с формой регистрации.
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/registrationStudent.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Регистрация студента");
            stage.setMinWidth(250);
            stage.setMinHeight(294);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }

    public void btnRegistrationAsTeacher(ActionEvent actionEvent) {
        //Создание выскакивающего окошка с формой регистрации.
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/registrationTeacher.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Регистрация преподавателя");
            stage.setMinWidth(250);
            stage.setMinHeight(255);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }
}
