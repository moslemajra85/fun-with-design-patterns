package com.ajra4code.observer;

public class ObserverDemo {

    public static void show() {

        var dataSource = new DataSource();
        var chart = new Chart(dataSource);
        var spreadSheet = new SpreadSheet(dataSource);
        dataSource.add(chart);
        dataSource.add(spreadSheet);
        dataSource.setValue(10);
        dataSource.setValue(7);





    }
}
