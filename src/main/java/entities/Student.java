package entities;

import java.util.List;

public class Student implements Entity {

    private int id;
    private String name;
    private String surname;
    private Group group;
    private boolean isElderGroup = false;
    private boolean isPresent;
    private double averageBall;
    private List<Professor> professorList;

    public Student(int id, String name, String surname, double averageBall) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.averageBall = averageBall;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public boolean isElderGroup() {
        return isElderGroup;
    }

    public void setElderGroup(boolean elderGroup) {
        isElderGroup = elderGroup;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public double getAverageBall() {
        return averageBall;
    }

    public void setAverageBall(double averageBall) {
        this.averageBall = averageBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", isElderGroup=" + isElderGroup +
                ", isPresent=" + isPresent +
                ", averageBall=" + averageBall +
                '}';
    }
}
