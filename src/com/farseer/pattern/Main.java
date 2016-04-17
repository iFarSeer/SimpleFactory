package com.farseer.pattern;

import com.farseer.pattern.factory.SimpleFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamburgStore king = new HamburgStore(new SimpleFactory());
        king.orderHamburg("bacon");
    }
}
