package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.DAO.StudentMarkSubjectTable;
import sample.actors.StudentMarksSubject;

public class showStudentsController {
    private StudentMarkSubjectTable studentMarkSubjectTable = new StudentMarkSubjectTable();

    @FXML
    private TableView tableContents;

    @FXML
    private ContextMenu contextMenu;

    @FXML
    private TableColumn<StudentMarksSubject, String> Student;

    @FXML
    private TableColumn<StudentMarksSubject, String> Group;

    @FXML
    private TableColumn<StudentMarksSubject, String> Topic;

    @FXML
    private TableColumn<StudentMarksSubject, Integer> Marks;

    @FXML
    private void initialize(){
        Student.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, String>("name"));
        Group.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, String>("group"));
        Topic.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, String>("topic"));
        Marks.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, Integer>("marks"));
        studentMarkSubjectTable.fillData();
        tableContents.setItems(studentMarkSubjectTable.getStudentMarksSubjectList());
        tableContents.setContextMenu(contextMenu);
    }

    public void Delete(ActionEvent actionEvent) {
        StudentMarksSubject studentMarksSubject = (StudentMarksSubject) tableContents.getSelectionModel().getSelectedItem();
        studentMarkSubjectTable.deleteStudentMarksSubject(studentMarksSubject);
    }

    public void Refactor(ActionEvent actionEvent) {
    }
}
