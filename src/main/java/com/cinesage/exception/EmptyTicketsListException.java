package com.cinesage.exception;

public class EmptyTicketsListException extends RuntimeException {

    public EmptyTicketsListException(){
        super("Ticket not found!");
    }

    public EmptyTicketsListException(String message){
        super(message);
    }
}
