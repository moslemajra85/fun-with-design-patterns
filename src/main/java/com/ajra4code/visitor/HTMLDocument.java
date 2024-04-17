package com.ajra4code.visitor;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {

    List<HTMLNode> nodes = new ArrayList<>();


    public void addNode(HTMLNode node) {
        nodes.add(node);
    }


    public void highlight() {
        nodes.forEach(HTMLNode::highlight);
    }
}
