package com.ajra4code.chainofresponsabilities;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticate");
        var isValid = request.getUsername().equals("admin") &&
        request.getPassword().equals("123");
        return !isValid;
    }
}
