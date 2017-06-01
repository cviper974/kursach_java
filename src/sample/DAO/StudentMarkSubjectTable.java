package sample.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.actors.StudentMarksSubject;

public class StudentMarkSubjectTable {
    private ObservableList<StudentMarksSubject> contents = FXCollections.observableArrayList();

    public ObservableList<StudentMarksSubject> getStudentMarksSubjectList(){ return contents; }

    public void addStudentMarksSubject(StudentMarksSubject studentMarkSubject){

    }

    public void deleteStudentMarksSubject(StudentMarksSubject studentMarksSubject){
        contents.remove(studentMarksSubject);
    }

    public void updateStudentMarksSubject(StudentMarksSubject studentMarksSubject){

    }

    public void fillData(){
        //Сделай запрос в БД и вытащи все темы из неё после чего запхай в эту коллекцию.
        contents.addAll();//В этот метод передай все темы что вытащил из БД.
        contents.add(new StudentMarksSubject("Max", "HAC-153", "kursa4", 2));//Просто тестовые вставки в таблицу
        contents.add(new StudentMarksSubject("Tolya", "HAC-152", "Xyi", 90));//для того чтобы глянуть как все
        contents.add(new StudentMarksSubject("Artem", "HAC-151", "Govno", 100));//смотрится. Не забудь убрать их.
    }
}

