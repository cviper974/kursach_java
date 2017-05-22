package sample.actors;

import java.io.Serializable;

public class Topic implements Serializable{
    private static final long serialVersionUID = 1L;

    private String topicName;

    public Topic(String topicName) { this.topicName = topicName; }

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
