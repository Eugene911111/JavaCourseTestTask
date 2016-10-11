package dao.general;

import dao.intefaces.entities.GroupDaoUnique;
import dao.intefaces.entities.ProfessorDaoUnique;
import dao.intefaces.entities.StudentDaoUnique;
import dao.factory.DaoFactoryRealization;

public abstract class DaoFactory {
    
    public abstract ProfessorDaoUnique createProfessorDao();
    
    public abstract StudentDaoUnique createStudentDao();
    
    public abstract GroupDaoUnique createGroupDao();
    
    /**
     * Method for connect with class factory methods for manipulating DAO
     * @return 
     */
    public static DaoFactory getInstance() {
        return new DaoFactoryRealization();
    }
    
}