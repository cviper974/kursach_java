package sample.actors;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String login;
    private String name;
    private String surname;
    private String group;
    private String password;
    private int[] marks;

    public Student(String login, String name, String surname, String group, String password) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.password = password;
    }

    public String getLogin() { return login;}

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {
        return "Student{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", password='" + password + '\'' +
                ", marks=" + marks +
                '}';
    }
}
