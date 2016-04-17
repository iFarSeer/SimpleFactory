package com.farseer.pattern;

import com.farseer.pattern.factory.SimpleFactory;
import com.farseer.pattern.hamburg.Hamburg;

/**
 * Created by zhaosc on 16/4/12.
 * 汉堡店
 */
public class HamburgStore {

    private SimpleFactory simpleFactory;

    public HamburgStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Hamburg orderHamburg(String type) {

        Hamburg hamburg = simpleFactory.createHamburg(type);
        hamburg.prepare();
        hamburg.make();
        hamburg.box();

        return hamburg;
    }
}
