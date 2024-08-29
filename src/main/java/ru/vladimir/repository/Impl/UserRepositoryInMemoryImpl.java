package ru.vladimir.repository.Impl;

import ru.vladimir.model.User;
import ru.vladimir.repository.BaseCrudRepository;

import java.util.List;

/**
 * Делаешь все аналогично с CarRepository
 */
public class UserRepositoryInMemoryImpl implements BaseCrudRepository<User, Long> {
    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User update(User user) {
        return null;
    }
}
