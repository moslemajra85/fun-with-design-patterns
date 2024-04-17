package com.ajra4code.visitor;

public class Demo {

    public static void show() {

        var heading = new HeadingNode();
        var anchor = new AnchorNode();
        var document = new HTMLDocument();
        document.addNode(heading);
        document.addNode(anchor);

        document.highlight();

    }
}
