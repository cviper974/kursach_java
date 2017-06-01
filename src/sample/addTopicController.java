package sample;

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
            topicName.setText("!!!Something field is empty!!!");
            topicText.setText("!!!Something field is empty!!!");
        } else {
            Topic topic = new Topic(topicName.getText(), topicText.getText());
            System.out.println("successful");
        }
    }
}
