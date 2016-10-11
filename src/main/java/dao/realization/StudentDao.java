package dao.realization;

import dao.intefaces.entities.StudentDaoUnique;
import entities.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Eugene on 11.10.2016.
 */
public class StudentDao implements StudentDaoUnique {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findEntityById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean delete(Student entity) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public boolean create(Student entity) {
        return false;
    }

    @Override
    public boolean update(Student entity) {
        return false;
    }


}
