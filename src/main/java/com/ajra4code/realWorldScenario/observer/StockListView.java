package com.ajra4code.realWorldScenario.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements  Observer{

    List<Stock> stocks = new ArrayList<>();

    @Override
    public void update(Stock stock) {

        var index = stocks.indexOf(stock);
        var st = stocks.get(index);
        st = stock;

    }

    public void addStock(Stock stock) {

        stocks.add(stock);
        stock.add(this);
    }


    public void show() {
        stocks.forEach(System.out::println);
    }


}
