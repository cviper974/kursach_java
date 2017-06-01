package sample;

import IO.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.DAO.TopicTable;
import sample.actors.Topic;

import java.io.IOException;

//Этот класс обслуживает меню студента
public class studentMainMenuController {
    private TopicTable topicTable_ = new TopicTable();

    @FXML
    private TableView tableContents;

    @FXML
    private TableColumn<Topic, String> columnTopic;

    @FXML
    private TextArea textArea;

    //Заполняем таблицу данными из коллекции
    @FXML
    private void initialize(){
        columnTopic.setCellValueFactory(new PropertyValueFactory<Topic, String>("topicName"));
        topicTable_.fillData();
        tableContents.setItems(topicTable_.getTopicList());
    }

    //Получаем тему которую выбрал студент.
    public void choice_of_topic(MouseEvent mouseEvent) {
        Topic selectedTopic = (Topic)tableContents.getSelectionModel().getSelectedItem();
        MouseButton mouseButton = mouseEvent.getButton();

        if(mouseButton.name().equals("PRIMARY")) {
            if (selectedTopic != null) {
                textArea.setText(DBOperations.receiveTopicContent(selectedTopic.getTopicName()));
            }else {System.out.println("empty");}
        }
    }

    public void ShowMarks(ActionEvent actionEvent) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/showMarks.fxml"));
            Stage stage = new Stage();
            stage.setTitle(".");
            stage.setMinWidth(268);
            stage.setMinHeight(404);
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException e){e.printStackTrace();}
    }

    public void ShowTests(ActionEvent actionEvent) {
        //Хз надо придумать как тесты красиво сделать
    }
}

