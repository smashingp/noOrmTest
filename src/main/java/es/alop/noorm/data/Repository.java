package es.alop.noorm.data;

import java.util.List;

import es.alop.noorm.exceptions.DatabaseException;

public interface Repository<T> {

	Long count();
	void insert(T entity) throws DatabaseException;
	void delete(T entity) throws DatabaseException;
	Long update(T entity) throws DatabaseException;
	List<T> findByPK(T entity) throws DatabaseException;
	
}
