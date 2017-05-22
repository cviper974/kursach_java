package sample;

import IO.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.actors.Student;
import sample.actors.Teacher;

public class registrationTeacherController {
    private String login;
    private String name;
    private String surname;
    private String password;

    @FXML
    private TextField loginField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private PasswordField passwordField;

    public void regNewTeacher(){        //Регаем нового препода
        login = loginField.getText();
        name = nameField.getText();
        surname = surnameField.getText();
        password = passwordField.getText();

        Teacher teacher = new Teacher(login, name, surname, password);

        DBOperations.insertTeacher(teacher);
    }

}
