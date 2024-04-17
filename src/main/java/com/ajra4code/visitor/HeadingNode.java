package com.ajra4code.visitor;

public class HeadingNode implements HTMLNode{
    @Override
    public void highlight() {
        System.out.println("highlight Heading");
    }
}
