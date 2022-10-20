package ru.evgenkov.springbootrest.exeption;


public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}
