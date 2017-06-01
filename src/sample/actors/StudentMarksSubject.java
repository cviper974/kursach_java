package sample.actors;

import java.io.Serializable;

public class StudentMarksSubject implements Serializable {
    private static final long serialVersionUID = 4L;

    private String name;
    private String group;
    private String subject;
    private int marks;

    public StudentMarksSubject(String name, String group, String subject, int marks) {
        this.name = name;
        this.group = group;
        this.subject = subject;
        this.marks = marks;
    }

    public StudentMarksSubject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
