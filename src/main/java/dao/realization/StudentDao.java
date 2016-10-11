package dao.realization;

import dao.SimpleDataBase;
import dao.intefaces.entities.StudentDaoUnique;
import entities.Group;
import entities.Student;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Eugene on 11.10.2016.
 */
public class StudentDao implements StudentDaoUnique {
    private SimpleDataBase database = new SimpleDataBase();

    @Override
    public List<Student> findAll() {
        return database.getAllStudents();
    }

    @Override
    public Student findEntityById(int id) {
        List<Student> students = findAll();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        List<Student> students = findAll();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                database.setAllStudents(students);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Student entity) {
        List<Student> students = findAll();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == entity.getId()) {
                students.remove(i);
                database.setAllStudents(students);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        database.setAllStudents(Collections.<Student>emptyList());
        return true;
    }

    @Override
    public boolean create(Student entity) {
        List<Student> students = findAll();
        students.add(entity);
        database.setAllStudents(students);
        return true;
    }

    @Override
    public boolean update(Student entity) {
        List<Student> students = findAll();
        students.set(entity.getId(), entity);
        database.setAllStudents(students);
        return false;
    }
}
