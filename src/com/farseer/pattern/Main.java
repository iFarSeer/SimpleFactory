package com.farseer.pattern;

import com.farseer.pattern.factory.SimpleFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamburgKing king = new HamburgKing(new SimpleFactory());
        king.orderHamburg("bacon");
    }
}
