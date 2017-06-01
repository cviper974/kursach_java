package sample.DAO;

import IO.DBOperations;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.Topic;

import java.util.ArrayList;

public class TopicTable {
    private ObservableList<Topic> contents = FXCollections.observableArrayList();

    public void addTopic(Topic topic){

    }

    public void deleteTopic(Topic topic){
        contents.remove(topic);
        DBOperations.removeTopic(topic);
    }

    public void updateTopic(Topic topic){

    }

    public ObservableList<Topic> getTopicList(){ return contents; }

    public void fillData(){
        ArrayList<Topic> receivedTopics = DBOperations.receiveAllTopics();
        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        contents.addAll(receivedTopics);//В этот метод передай все темы что вытащил из БД.

    }
}
