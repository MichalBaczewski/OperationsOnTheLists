package com.michalbaczewski.lists;

public class Main {
    public static void main(String[] args) {
        List list = new List(3);
        list.print();
        list.add(0);
        list.add(10);
        list.add(15);
        list.add(20);
        list.print();
        System.out.println(list.getNumber(0));
        System.out.println(list.getNumber(1));
        System.out.println(list.getNumber(3));
        System.out.println();
        System.out.println("Czas na polimorfizm (ChildList): ");
        ChildList childList = new ChildList(3);
        childList.add(2);
        childList.add(1);
        childList.add(3);
        childList.print();
        System.out.println("Czas na polimorfizm (Lotto): ");
        Lotto lotto = new Lotto();
        lotto.add(1);
        lotto.add(2);
        lotto.add(3);
        lotto.add(4);
        lotto.add(5);
        lotto.add(50);
        lotto.add(10);
        lotto.add(30);
        lotto.print();
    }
}
