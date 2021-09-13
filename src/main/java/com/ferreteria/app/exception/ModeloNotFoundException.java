package com.ferreteria.app.exception;

@SuppressWarnings("serial")
public class ModeloNotFoundException extends RuntimeException{

    public ModeloNotFoundException(String message) {
        super(message);
        
    }
}