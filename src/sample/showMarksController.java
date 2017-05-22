package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.DAO.MarksTable;
import sample.actors.StudentMarksSubject;

public class showMarksController {
    private MarksTable marksTable = new MarksTable();

    @FXML
    private TableView tableContents;

    @FXML
    private TableColumn<StudentMarksSubject, String> Subject;

    @FXML
    private TableColumn<StudentMarksSubject, Integer> Marks;

    @FXML
    private void initialize(){
        System.out.println("dasdasd");
        Subject.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, String>("subject"));
        Marks.setCellValueFactory(new PropertyValueFactory<StudentMarksSubject, Integer>("marks"));
        marksTable.fillData();
        tableContents.setItems(marksTable.getTopicList());
    }
}

