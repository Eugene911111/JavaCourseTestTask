package dao.general;

import entities.Entity;

import java.util.List;
import java.util.Map;

public interface AbstractDAO<T extends Entity> {

    public List<T> findAll();

    public T findEntityById(int id);

    public boolean delete(int id);

    public boolean delete(T entity);

    public boolean deleteAll();

    public boolean create(T entity);
    
    public boolean update(T entity);

}
