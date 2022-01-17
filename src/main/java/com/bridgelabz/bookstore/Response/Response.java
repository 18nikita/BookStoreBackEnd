package com.bridgelabz.bookstore.Response;


public class Response {

    private final String message;
    private int statusCode;

    public Response( String message ) {
        this.message = message;
    }

    public Response( String message, int statusCode ) {
        this(message);
        this.statusCode = statusCode;
    }

    public String getMessage() { return message; }

    public int getStatusCode() { return statusCode; }
}
