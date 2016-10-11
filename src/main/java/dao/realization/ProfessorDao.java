package dao.realization;

import dao.SimpleDataBase;
import dao.intefaces.entities.ProfessorDaoUnique;
import entities.Group;
import entities.Professor;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.prefs.PreferenceChangeEvent;

public class ProfessorDao implements ProfessorDaoUnique {
    private SimpleDataBase database = new SimpleDataBase();

    @Override
    public List<Professor> findAll() {
        return database.getAllProfessors();
    }

    @Override
    public Professor findEntityById(int id) {
        List<Professor> professors = findAll();
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == id) {
                return professors.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        List<Professor> professors = findAll();
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == id) {
                professors.remove(i);
                database.setAllProfessors(professors);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Professor entity) {
        List<Professor> professors = findAll();
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == entity.getId()) {
                professors.remove(i);
                database.setAllProfessors(professors);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        database.setAllProfessors(Collections.<Professor>emptyList());
        return true;
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
        List<Professor> professors = findAll();
        professors.set(entity.getId(), entity);
        database.setAllProfessors(professors);
        return false;
    }
}
