package sample.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.Topic;

public class TopicTable {
    private ObservableList<Topic> contents = FXCollections.observableArrayList();

    public void addTopic(Topic topic){

    }

    public void deleteTopic(Topic topic){
        contents.remove(topic);
    }

    public void updateTopic(Topic topic){

    }

    public ObservableList<Topic> getTopicList(){ return contents; }

    public void fillData(){
        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        contents.addAll();//В этот метод передай все темы что вытащил из БД.
        contents.add(new Topic("dasd"));//Просто тестовые вставки в таблицу
        contents.add(new Topic("asd"));//для того чтобы глянуть как все
        contents.add(new Topic("asdasd"));//смотрится. Не забудь убрать их.
    }
}
