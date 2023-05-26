package acme.camunda.services;

import acme.camunda.entities.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

}
