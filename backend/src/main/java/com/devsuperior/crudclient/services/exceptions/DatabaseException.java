package com.devsuperior.crudclient.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg){
        // send the msg to constructor of the superclass (RuntimeException)
        super(msg);
    }

}
