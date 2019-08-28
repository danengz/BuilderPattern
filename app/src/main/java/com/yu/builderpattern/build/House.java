package com.yu.builderpattern.build;

/**
 * 大House
 */
public class House {

    private double width;

    private int height;

    private String color;

    public House(BuildingDesign design) {
        this.width = design.getWidth();
        this.height = design.getHeight();
        this.color = design.getColor();
    }

    @Override
    public String toString() {
        return "House{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
