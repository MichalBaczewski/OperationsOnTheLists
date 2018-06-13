package com.michalbaczewski.lists;

public class ChildList extends List {

    public ChildList(int capacity) {
        super(capacity);
    }

    @Override
    public void add(int number) {
        if (size == capacity) {
            System.out.println("Lista pełna.");
        } else if (size > 0) {
            for (int index = size; index > 0; index--) {
                this.number[index] = this.number[index - 1];
            }
            this.number[0] = number;
            size++;
        } else {
            this.number[0] = number;
            size++;
        }
    }
}
