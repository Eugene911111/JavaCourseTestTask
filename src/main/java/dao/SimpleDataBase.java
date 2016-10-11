package dao;


import entities.Group;
import entities.Professor;
import entities.Student;

import java.util.List;

public class SimpleDataBase {

    private List<Student> allStudents;
    private List<Professor> allProfessors;
    private List<Group> allGroups;

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public List<Professor> getAllProfessors() {
        return allProfessors;
    }

    public void setAllProfessors(List<Professor> allProfessors) {
        this.allProfessors = allProfessors;
    }

    public List<Group> getAllGroups() {
        return allGroups;
    }

    public void setAllGroups(List<Group> allGroups) {
        this.allGroups = allGroups;
    }


}
