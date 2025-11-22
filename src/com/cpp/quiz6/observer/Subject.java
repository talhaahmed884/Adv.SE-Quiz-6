package com.cpp.quiz6.observer;

public abstract class Subject {
    private Observer observer;

    protected Subject() {
    }

    public void attach(Observer observer) {
        this.observer = observer;
    }

    public void detach() {
        this.observer = null;
    }

    public void notifyObserver(String symbol, double price) {
        if (observer != null) {
            observer.update(symbol, price);
        } else {
            System.out.println("Observer is not attached. Can't update the Observer.");
        }
    }
}
