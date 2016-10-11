package entities;

import java.util.List;

public class Professor implements Entity {

    private int id;
    private String professorName;
    private List<Group> groups;
    private List<Student> students;

    public Professor(int id, String professorName) {
        this.id = id;
        this.professorName = professorName;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", professorName='" + professorName + '\'' +
                '}';
    }

}
