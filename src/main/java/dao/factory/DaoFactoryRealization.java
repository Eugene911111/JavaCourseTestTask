package dao.factory;

import dao.intefaces.entities.GroupDaoUnique;
import dao.intefaces.entities.ProfessorDaoUnique;
import dao.intefaces.entities.StudentDaoUnique;
import dao.general.DaoFactory;

public class DaoFactoryRealization extends DaoFactory {

    @Override
    public ProfessorDaoUnique createProfessorDao() {
        return null;
    }

    @Override
    public StudentDaoUnique createStudentDao() {
        return null;
    }

    @Override
    public GroupDaoUnique createGroupDao() {
        return null;
    }

}
