package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import sample.DAO.TopicTable;
import sample.actors.Topic;

//Этот класс обслуживает меню студента
public class studentMainMenuController {
    TopicTable topicTable_ = new TopicTable();


    @FXML
    private TableView tableContents;

    @FXML
    private TableColumn<Topic, String> contents;

    //Заполняем таблицу данными из коллекции
    @FXML
    private void initialize(){
        contents.setCellValueFactory(new PropertyValueFactory<>("topicName"));
        topicTable_.fillData();
        tableContents.setItems(topicTable_.getTopicList());
    }

    //Получаем тему которую выбрал студент.
    public void choice_of_topic(MouseEvent mouseEvent) {
        Topic selectedTopic = (Topic)tableContents.getSelectionModel().getSelectedItem();
        MouseButton mouseButton = mouseEvent.getButton();

        if(mouseButton.name().equals("PRIMARY")){
            selectedTopic.getFilePath();
            //У тебя есть путь к файлу выбранной студентом темы делай шо хош с ним.
        }
    }

    //Я завтра для кнопок намучу херню
    public void Exit(ActionEvent actionEvent) {
        //Потом добави какую-то хуйню сюда, или вообще уберем
    }

    public void ShowMarks(ActionEvent actionEvent) {
        //Делай запрос в БД и показывай пиздюку его быллы
    }

    public void ShowTests(ActionEvent actionEvent) {
        //Хз надо придумать как тесты красиво сделать
    }
}

