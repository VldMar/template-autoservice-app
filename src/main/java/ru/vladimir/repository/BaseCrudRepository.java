package ru.vladimir.repository;

import ru.vladimir.model.BaseEntity;
import java.util.List;

public interface BaseCrudRepository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    void save(T t);
    void delete(T t);
    T update(T t);
}
