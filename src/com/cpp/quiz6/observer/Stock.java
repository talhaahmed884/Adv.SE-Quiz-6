package com.cpp.quiz6.observer;

public class Stock extends Subject {
    private String symbol;
    private double price;

    public Stock(String symbol) {
        super();
        this.symbol = symbol;
        this.price = 0.0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver(symbol, this.price);
    }

    public void attach(Observer observer) {
        super.attach(observer);
        this.notifyObserver(this.symbol, this.price);
    }
}
