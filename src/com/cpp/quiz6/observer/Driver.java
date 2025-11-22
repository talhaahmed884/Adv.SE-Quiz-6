package com.cpp.quiz6.observer;

public class Driver {
    public static void main(String[] args) {
        Stock stock = new Stock("$");
        Observer observer = new StockNotifier(stock);
        System.out.println();

        stock.setPrice(5.0);
        System.out.println();

        stock.setPrice(1.0);
        System.out.println();

        stock.setPrice(50.0);
        System.out.println();

        stock.setPrice(20.0);
        System.out.println();
    }
}