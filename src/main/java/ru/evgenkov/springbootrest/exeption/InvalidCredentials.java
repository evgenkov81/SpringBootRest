package ru.evgenkov.springbootrest.exeption;

import java.io.IOException;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}
