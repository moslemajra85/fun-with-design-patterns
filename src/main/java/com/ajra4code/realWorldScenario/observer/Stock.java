package com.ajra4code.realWorldScenario.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements  Subject{

    private String Symbol;
    private double price;
    private List<Observer> observers = new ArrayList<>();
    public Stock() {
    }
    public Stock(String symbol, double price) {
        Symbol = symbol;
        this.price = price;
    }
    public void add(Observer observer) {
        observers.add(observer);
    }
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.forEach((obs) -> obs.update(this));
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
    public String getSymbol() {
        return Symbol;
    }
    public void setSymbol(String symbol) {
        Symbol = symbol;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "Symbol='" + Symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
