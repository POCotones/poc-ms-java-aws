package com.ritallus.ms_users.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String exception){
        super(exception);
    }

    public DatabaseException(String message, Exception exception){
        super(message, exception);
    }
}
