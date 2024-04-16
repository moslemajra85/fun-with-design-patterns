package com.ajra4code.observer;

public class SpreadSheet implements  Observer{

     private final DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
         System.out.println("Value: " + dataSource.getValue());
    }


}
