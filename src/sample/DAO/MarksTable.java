package sample.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.StudentMarksSubject;

public class MarksTable {
    private ObservableList<StudentMarksSubject> contents = FXCollections.observableArrayList();

    public ObservableList<StudentMarksSubject> getTopicList(){ return contents; }

    public void fillData(){
        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        //contents.addAll();//В этот метод передай все темы что вытащил из БД.
        contents.add(new StudentMarksSubject("asdasd", 123));//Просто тестовые вставки в таблицу
        contents.add(new StudentMarksSubject("asdas", 1123132));//для того чтобы глянуть как все
        contents.add(new StudentMarksSubject("aaaaa", 123123123));//смотрится. Не забудь убрать их.
        System.out.println("true");
    }
}
