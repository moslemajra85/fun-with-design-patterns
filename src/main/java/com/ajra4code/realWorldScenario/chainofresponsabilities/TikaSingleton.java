package com.ajra4code.realWorldScenario.chainofresponsabilities;

import org.apache.tika.Tika;

public class TikaSingleton {

    private static volatile Tika tika;

    private TikaSingleton() {} // Private constructor

    public static Tika getInstance() {
        if (tika == null) {
            synchronized (TikaSingleton.class) {
                if (tika == null) {
                    tika = new Tika();
                }
            }
        }
        return tika;
    }

}
