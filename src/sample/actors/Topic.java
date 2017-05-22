package sample.actors;

import java.io.Serializable;

public class Topic implements Serializable{
    private static final long serialVersionUID = 1L;

    private String topicName;
    private String path_to_topic;

    public Topic(String topicName) { this.topicName = topicName; }

    public Topic(String topicName, String path_to_topic) {
        this.topicName = topicName;
        this.path_to_topic = path_to_topic;
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
                ", path_to_topic='" + path_to_topic + '\'' +
                '}';
    }
}
