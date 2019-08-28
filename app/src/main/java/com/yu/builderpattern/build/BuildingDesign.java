package com.yu.builderpattern.build;

/**
 * 房屋设计图
 */
public class BuildingDesign {

    private double width = 2;

    private int height = 100;

    private String color = "白色";

    public BuildingDesign() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
