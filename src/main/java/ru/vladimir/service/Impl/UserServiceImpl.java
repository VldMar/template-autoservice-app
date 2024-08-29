package ru.vladimir.service.Impl;

import ru.vladimir.model.User;
import ru.vladimir.repository.BaseCrudRepository;
import ru.vladimir.repository.Impl.UserRepositoryInMemoryImpl;
import ru.vladimir.service.UserService;

import java.util.List;

/**
 * Здесь, например, в каждом методе можешь добавить логи или еще связную инфу
 */
public class UserServiceImpl implements UserService {

    private final BaseCrudRepository<User, Long> userRepository = new UserRepositoryInMemoryImpl();


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.update(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(getUser(id));
    }

    @Override
    public User getUser(int id) {
        // TODO:: здесь костыль, поправить надо
        return userRepository.findById((long) id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
