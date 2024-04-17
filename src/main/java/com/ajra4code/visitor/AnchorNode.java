package com.ajra4code.visitor;

public class AnchorNode implements HTMLNode{
    @Override
    public void highlight() {
        System.out.println("Highlight Anchor");
    }
}
