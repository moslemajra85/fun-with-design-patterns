package com.ajra4code.realWorldScenario.observer;

public class Demo {

    public static void show() {
        var statusBar = new StatusBar();
        var stackListView = new StockListView();
        var stock = new Stock("xxx", 12.5);
        var stock2 = new Stock("yyy", 7.5);
        var stock3 = new Stock("zzz", 78.3);

        stackListView.addStock(stock);
        stackListView.addStock(stock2);
        stackListView.addStock(stock3);

        statusBar.addStock(stock);
        statusBar.addStock(stock2);
        statusBar.addStock(stock3);
        stock.add(statusBar);
        statusBar.show();

        System.out.println("###################################");
        stackListView.show();
        System.out.println("###################################");

        stock.setPrice(20.88);
        stock.setSymbol("Test");
        stock2.setPrice(1.0);
        stock3.setPrice(100.0);

        statusBar.show();
        System.out.println("###################################");
        stackListView.show();


    }
}
