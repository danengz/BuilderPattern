package com.yu.builderpattern;

import com.yu.builderpattern.build.House;
import com.yu.builderpattern.build.HouseBuilder;

public class Main {

    public static void main(String[] args) {

//        HouseBuilder builder = new HouseBuilder();
//        builder.setWidth(130.00);
//        builder.setHeight(3);
//        builder.setColor("红色");
//        House house = builder.build();

        System.out.println( new HouseBuilder().setWidth(130.00).setHeight(3).setColor("红色").build());
        System.out.println( new HouseBuilder().setHeight(3).setColor("红色").build());
        System.out.println( new HouseBuilder().setColor("红色").build());
        System.out.println( new HouseBuilder().build());
    }
}
