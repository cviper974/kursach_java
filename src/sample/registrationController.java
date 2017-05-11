package sample;

import IO.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.actors.Student;
import sample.actors.Teacher;

public class registrationController {
    private String login;
    private String name;
    private String surname;
    private String group;
    private String password;

    @FXML
    private TextField loginField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextField groupField;

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

    public void regNewStudent(ActionEvent actionEvent) { //Регаем нового студента
        login = loginField.getText();
        name = nameField.getText();
        surname = surnameField.getText();
        group = groupField.getText();
        password = passwordField.getText();

        Student student = new Student(login, name, surname, group, password);

        DBOperations.insertStudent(student);

    }
}
