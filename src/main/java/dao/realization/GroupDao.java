package dao.realization;

import dao.SimpleDataBase;
import dao.intefaces.entities.GroupDaoUnique;
import entities.Group;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Eugene on 11.10.2016.
 */
public class GroupDao implements GroupDaoUnique {

    private SimpleDataBase database = new SimpleDataBase();

    @Override
    public List<Group> findAll() {
        return database.getAllGroups();
    }

    @Override
    public Group findEntityById(int id) {
        List<Group> groups = findAll();

        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getId() == id) {
                return groups.get(i);
            }
        }

//        for (Group group : groups) {
//            if (group.getId() == id) {
//                return group;
//            }
//        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        List<Group> groups = findAll();
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getId() == id) {
                groups.remove(i);
                database.setAllGroups(groups);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Group entity) {
        List<Group> groups = findAll();
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getId() == entity.getId()) {
                groups.remove(i);
                database.setAllGroups(groups);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        database.setAllGroups(Collections.<Group>emptyList());
        return true;
    }

    @Override
    public boolean create(Group entity) {
        List<Group> groups = findAll();
        groups.add(entity);
        database.setAllGroups(groups);
        return true;
    }

    @Override
    public boolean update(Group entity) {
        List<Group> groups = findAll();
        groups.set(entity.getId(), entity);
        database.setAllGroups(groups);
        return false;
    }

}
