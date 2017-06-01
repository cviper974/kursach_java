package sample;

import IO.DBOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.actors.Topic;

public class addTopicController {

    @FXML
    private TextField topicName;

    @FXML
    private TextArea topicText;

    public void AddTopic(ActionEvent actionEvent) {
        if(topicName.getText().equals("") || topicText.getText().equals("")){
            topicName.setText("!!!Name field is empty!!!");
            topicText.setText("!!!Text field is empty!!!");
        } else {
            Topic topic = new Topic(topicName.getText(), topicText.getText());
            DBOperations.insertTopic(topic);
        }
    }
}
