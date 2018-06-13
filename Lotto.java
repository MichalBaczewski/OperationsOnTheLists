package com.michalbaczewski.lists;

public class Lotto extends List {

    public Lotto() {
        super(6);
    }

    public void add(int number) {
        if (number > 0 && number < 50) {
            super.add(number);
        } else {
            System.out.println("Zła liczba.");
        }
    }
}
