package com.ajra4code.visitor;

public class HeadingNode implements HTMLNode{
    //extensibility point
    @Override
    public void execute(Operation operation) {
        operation.apply(this);

    }
}
