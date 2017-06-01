package sample.DAO;

import IO.DBComposite;
import IO.DBOperations;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.StudentMarksSubject;

import java.util.ArrayList;

public class MarksTable {
    private ObservableList<StudentMarksSubject> contents = FXCollections.observableArrayList();

    public ObservableList<StudentMarksSubject> getTopicList(){ return contents; }

    public void fillData(){
        DBComposite.joinStudentsMarks();
        ArrayList<StudentMarksSubject>  arrayListSMS = DBOperations.receiveAllSMS();

        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        contents.addAll();//В этот метод передай все темы что вытащил из БД./

        contents.add(new StudentMarksSubject("Ivanov", "Petr", "OOP", 90));
        contents.add(new StudentMarksSubject("Vassili", "International", "Exceptions", 100));
        contents.add(new StudentMarksSubject("Max", "Payne", "Inheritance", 0));

        System.out.println("true");
    }
}
