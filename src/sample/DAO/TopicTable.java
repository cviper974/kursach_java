package sample.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.Topic;

public class TopicTable {
    private ObservableList<Topic> contents = FXCollections.observableArrayList();

    public void addTopic(Topic topic){

    }

    public void deleteTopic(Topic topic){

    }

    public void updateTopic(Topic topic){

    }

    public ObservableList<Topic> getTopicList(){ return contents; }

    public void fillData(){
        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        contents.addAll();//В этот метод передай все темы что вытащил из БД.
        contents.add(new Topic("dasd", "C:/User/Documents/myDoc1"));//Просто тестовые вставки в таблицу
        contents.add(new Topic("asd", "C:/User/Documents/myDoc2"));//для того чтобы глянуть как все
        contents.add(new Topic("asdasd", "C:/User/Documents/myDoc3"));//смотрится. Не забудь убрать их.
    }
}
