package com.ajra4code.realWorldScenario.observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements  Observer{
    private List<Stock> popularStocks = new ArrayList<>();
    public StatusBar() {
     }


     public void addStock(Stock stock) {
        popularStocks.add(stock);
     }
    @Override
    public void update(Stock stock) {

        if(popularStocks.contains(stock)) {
            int index = popularStocks.indexOf(stock);
            var st = popularStocks.get(index);
            st = stock;
        }
    }

    public List<Stock> getPopularStocks() {
        return popularStocks;
    }

    public void setPopularStocks(List<Stock> popularStocks) {
        this.popularStocks = popularStocks;
    }

    public void show() {
        popularStocks.forEach(System.out::println);
    }


}
