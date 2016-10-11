package dao.realization;

import dao.SimpleDataBase;
import dao.intefaces.entities.ProfessorDaoUnique;
import entities.Group;
import entities.Professor;

import java.util.List;
import java.util.Map;

public class ProfessorDao implements ProfessorDaoUnique {
    private SimpleDataBase database = new SimpleDataBase();
    @Override
    public List<Professor> findAll() {
        return null;
    }

    @Override
    public Professor findEntityById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean delete(Professor entity) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public boolean create(Professor entity) {
        List<Professor> professors = findAll();
        professors.add(entity);
        database.setAllProfessors(professors);
        return true;
    }

    @Override
    public boolean update(Professor entity) {
        return false;
    }
}
