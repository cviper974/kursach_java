package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.DAO.TopicTable;
import sample.actors.Topic;

import java.io.IOException;

public class teacherMainMenuController {
    private TopicTable topicTable = new TopicTable();

    @FXML
    private TableView tableContents;

    @FXML
    private ContextMenu contextMenu;

    @FXML
    private TableColumn<Topic, String> columnTopic;

    @FXML
    private void initialize(){
        columnTopic.setCellValueFactory(new PropertyValueFactory<Topic, String>("topicName"));
        topicTable.fillData();
        tableContents.setItems(topicTable.getTopicList());
        tableContents.setContextMenu(contextMenu);
    }

    //Получаем тему которую выбрал студент.
    public void choice_of_topic(MouseEvent mouseEvent) {
        Topic selectedTopic = (Topic)tableContents.getSelectionModel().getSelectedItem();
        MouseButton mouseButton = mouseEvent.getButton();

        if(mouseButton.name().equals("PRIMARY")) {
            if (selectedTopic != null) {
                System.out.println(selectedTopic.getTopicName());
            }else {System.out.println("empty");}
        }
    }


    public void DeleteTopic(ActionEvent actionEvent) {
        Topic topic = (Topic) tableContents.getSelectionModel().getSelectedItem();
        topicTable.deleteTopic(topic);
    }

    public void Rename(ActionEvent actionEvent) {
    }

    public void showStudents(ActionEvent actionEvent) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/showStudents.fxml"));
            Stage stage = new Stage();
            stage.setTitle(".");
            stage.setMinWidth(456);
            stage.setMinHeight(448);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }

    public void addTopic(ActionEvent actionEvent) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/addTopic.fxml"));
            Stage stage = new Stage();
            stage.setTitle(".");
            stage.setMinWidth(1166);
            stage.setMinHeight(835);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }

    public void addTest(ActionEvent actionEvent) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/addTest.fxml"));
            Stage stage = new Stage();
            stage.setTitle(".");
            stage.setMinWidth(359);
            stage.setMinHeight(151);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }
}
