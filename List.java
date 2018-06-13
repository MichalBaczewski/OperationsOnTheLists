package com.michalbaczewski.lists;

public class List {
    protected int[] number;
    protected int capacity;
    protected int size;

    public List(int capacity) {
        this.capacity = capacity;
        number = new int[capacity];
    }

    public int getNumber(int index) {
        if (index >= capacity) {
            System.out.println("Poza zasięgiem.");
            return -1;
        } else if (index > size) {
            System.out.println("Nie ma takiego indeksu.");
            return -1;
        } else {
            return number[index];
        }
    }

    public void add(int number) {
        if (size == capacity) {
            System.out.println("Lista pełna.");
            return;
        } else {
            this.number[size] = number;
            size++;
            return;
        }
    }

    public void print() {
        for (int index = 0; index < size; index++) {
            System.out.print(this.number[index] + " ");
        }
        System.out.println();
    }
}
