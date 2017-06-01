package IO;

import sample.actors.Student;
import sample.actors.StudentMarksSubject;
import sample.actors.Teacher;
import sample.actors.Topic;


import java.sql.*;
import java.util.ArrayList;

public class DBOperations {

    private static final String URL = "jdbc:mysql://localhost:3306/database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    DBOperations(){

    }
    public static void insertStudent(Student student){
        DBWorker dbw = new DBWorker();

        try {
            String preparedstatement = "INSERT INTO students (login, name, surname, study_group, password)" +
                                      " VALUES (?, ?, ?, ?, ?)";


            PreparedStatement ps = dbw.getConnection().prepareStatement(preparedstatement);

            ps.setString(1, student.getLogin());
            ps.setString(2, student.getName());
            ps.setString(3, student.getSurname());
            ps.setString(4, student.getGroup());
            ps.setString(5, student.getPassword());
            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean loginCheckStudent(String login, String password){
        DBWorker dbw = new DBWorker();
        ResultSet result;

        String  student_login    = "\"" + login     + "\"",
                student_password = "\"" + password  + "\"";

        String query = "SELECT login, password FROM students WHERE login LIKE " + student_login
                + " AND password LIKE " + student_password;

        try {
            Statement statement = dbw.getConnection().createStatement();

            result = statement.executeQuery(query);

            while (result.next()){
                if (login.equals( result.getString(1))){
                    if (password.equals(result.getString(2))){
                        return true;
                    } else{
                        return false;
                    }

                } else {
                    return false;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static void insertTeacher(Teacher teacher) {
        DBWorker dbw = new DBWorker();

        try {
            String preparedstatement = "INSERT INTO teachers (login, name, surname, password)" +
                    " VALUES (?, ?, ?, ?)";


            PreparedStatement ps = dbw.getConnection().prepareStatement(preparedstatement);

            ps.setString(1, teacher.getLogin());
            ps.setString(2, teacher.getName());
            ps.setString(3, teacher.getSurname());
            ps.setString(4, teacher.getPassword());
            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean loginCheckTeacher(String login, String password){
        DBWorker dbw = new DBWorker();
        ResultSet result;

        String  teacher_login    = "\"" + login     + "\"",
                teacher_password = "\"" + password  + "\"";

        String query = "SELECT login, password FROM teachers WHERE login LIKE " + teacher_login
                + " AND password LIKE " + teacher_password;

        try {
            Statement statement = dbw.getConnection().createStatement();

            result = statement.executeQuery(query);

            while (result.next()){
                if (login.equals( result.getString(1))){
                    return password.equals(result.getString(2));

                } else {
                    return false;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static void insertStudentMarkSubject(StudentMarksSubject sms){
        DBWorker dbw = new DBWorker();
        try {
            String preparedstatement = "INSERT INTO studentmarksubject (name, `group`, mark, subject)" +
                    " VALUES (?, ?, ?, ?)";

            PreparedStatement ps = dbw.getConnection().prepareStatement(preparedstatement);

            ps.setString(1, sms.getName());
            ps.setString(2, sms.getGroup());
            ps.setString(3, Integer.toString(sms.getMarks()));
            ps.setString(4, sms.getSubject());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertTopic(Topic topic){
        DBWorker dbw = new DBWorker();

        try {
            String preparedstatement = "INSERT INTO topics (name, contents)" +
                    " VALUES (?, ?)";

            PreparedStatement ps = dbw.getConnection().prepareStatement(preparedstatement);

            ps.setString(1, topic.getTopicName());
            ps.setString(2, topic.getTopicText());
            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Topic> receiveAllTopics(){
        ArrayList<Topic> topicsReceived = new ArrayList <>();
        String query = "SELECT * FROM topics";
        DBWorker dbw = new DBWorker();

        try{
            PreparedStatement ps = dbw.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Topic topic = new Topic(rs.getString(2), rs.getString(3));
                topicsReceived.add(topic);
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

    public static String receiveTopicContent (){
        DBWorker dbw = new DBWorker();
        String query = "SELECT name, contents FROM topics";
        String contentsReceived = null;

        try{
            PreparedStatement ps = dbw.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            contentsReceived = rs.getString(3);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (contentsReceived != null){
            return contentsReceived;
        } else{
            return null;
        }
    }

    public static void insertStudentMark(String name, int mark, String subjectName){
        DBWorker dbw = new DBWorker();

        try {
            String preparedstatement = "INSERT INTO studentmarksubject (name, mark, subject)" +
                    " VALUES (?, ?, ?)";

            PreparedStatement ps = dbw.getConnection().prepareStatement(preparedstatement);

            ps.setString(1, name);
            ps.setString(2, Integer.toString(mark));
            ps.setString(3, subjectName);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String receiveMark (Student student, String subject){
        DBWorker dbw = new DBWorker();
        String query = "SELECT mark FROM studentmarksubject WHERE name LIKE " + student.getName() + " AND subject LIKE "
                + subject;
        String markReceived = null;

        try{
            PreparedStatement ps = dbw.getConnection().prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            markReceived = rs.getString(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (markReceived != null){
            return markReceived;
        } else{
            return null;
        }
    }

    public static void removeTopic (Topic topic) {
        DBWorker dbw = new DBWorker();
        String query = "DELETE FROM topics WHERE name = " + topic.getTopicName();

        try{
            PreparedStatement ps = dbw.getConnection().prepareStatement(query);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
