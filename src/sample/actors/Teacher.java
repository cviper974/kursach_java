package sample.actors;

import java.io.Serializable;

public class Teacher implements Serializable{
    private static final long serialVersionUID = 3L;

    private String login;
    private String name;
    private String surname;
    private String password;

    public Teacher(String login, String name, String surname, String password) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "0" + login + "0" + name + "0" + surname + "0" + password + "0";
    }
}
