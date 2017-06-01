package sample.actors;

import java.io.Serializable;

public class Topic implements Serializable{
    private static final long serialVersionUID = 1L;

    private String topicName;

    private String topicText;

    public Topic(String topicName, String topicText) {
        this.topicName = topicName;
        this.topicText = topicText;
    }

    public Topic(String topicName) { this.topicName = topicName; }

    public String getTopicText() {
        return topicText;
    }

    public void setTopicText(String topicText) {
        this.topicText = topicText;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicName='" + topicName + '\'' +
                '}';
    }
}
