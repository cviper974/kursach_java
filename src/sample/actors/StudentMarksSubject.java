package sample.actors;

public class StudentMarksSubject {
    private String name;
    private String subject;
    private int marks;

    public StudentMarksSubject(String name, String subject, int marks) {
        this.name = name;
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
