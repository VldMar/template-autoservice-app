package ru.vladimir.service;

import ru.vladimir.model.User;

import java.util.List;

/**
 * В этом интерфейсе ты будешь задавать специфичесике функции бизнес-логики.
 * То, что методы идентичны могут быть repository - это нормально
 */
public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUser(int id);
    List<User> getAllUsers();
}
