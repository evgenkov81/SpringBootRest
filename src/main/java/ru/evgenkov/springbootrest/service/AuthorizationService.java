package ru.evgenkov.springbootrest.service;

import ru.evgenkov.springbootrest.exeption.InvalidCredentials;
import ru.evgenkov.springbootrest.exeption.UnauthorizedUser;
import ru.evgenkov.springbootrest.model.Authorities;
import ru.evgenkov.springbootrest.repository.UserRepository;

import java.util.List;


public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
