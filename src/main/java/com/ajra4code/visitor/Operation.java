package com.ajra4code.visitor;

public interface Operation {
    void apply(AnchorNode anchor);
    void apply(HeadingNode heading);
}
