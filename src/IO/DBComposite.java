package IO;

import sample.actors.Student;
import sample.actors.StudentMarksSubject;
import sample.actors.Topic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBComposite {
    public static ArrayList<Topic> joinStudentsMarks(){
        ArrayList<Topic> topicsReceived = new ArrayList <>();
        String query = "SELECT * FROM students";
        DBWorker dbw = new DBWorker();

        try{
            PreparedStatement ps = dbw.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Student student = new Student (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(4));
                StudentMarksSubject sms = new StudentMarksSubject(student.getName(), student.getGroup(), "test", 0);
                DBOperations.insertStudentMarkSubject(sms);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (topicsReceived.size() != 0){
            return  topicsReceived;
        } else{
            return null;
        }
    }
}
