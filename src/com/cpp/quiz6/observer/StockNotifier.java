package com.cpp.quiz6.observer;

public class StockNotifier implements Observer {
    private String symbol;
    private double price;

    public StockNotifier(Stock stock) {
        this.symbol = stock.getSymbol();
        this.price = stock.getPrice();
        stock.attach(this);
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println("Stock notifier update");
        System.out.println("Symbol: " + symbol);
        System.out.println("Price: " + price);

        if (this.price > price) {
            System.out.println("Stock price went down!");
        } else if (this.price < price) {
            System.out.println("Stock price went up!");
        } else {
            System.out.println("Stock price hasn't changed!");
        }

        this.symbol = symbol;
        this.price = price;
    }
}
