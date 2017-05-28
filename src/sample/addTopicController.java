package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class addTopicController {
    private String name;
    private String text;

    @FXML
    private TextField topicName;

    @FXML
    private TextArea topicText;

    public void AddTopic(ActionEvent actionEvent) {
        if(topicName.getText().equals("") || topicText.getText().equals("")){
            topicName.setText("!!!Name field is empty!!!");
            topicText.setText("!!!Text field is empty!!!");
        } else {
            name = topicName.getText();
            text = topicText.getText();
            System.out.println("successful");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
