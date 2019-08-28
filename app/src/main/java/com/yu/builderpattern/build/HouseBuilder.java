package com.yu.builderpattern.build;

/**
 * 构建者
 */
public class HouseBuilder {

    private BuildingDesign buildingDesign;

    public HouseBuilder() {
        buildingDesign = new BuildingDesign();
    }

    public HouseBuilder setWidth(double width) {
        this.buildingDesign.setWidth(width);
        return this;
    }

    public HouseBuilder setHeight(int height) {
        this.buildingDesign.setHeight(10);
        return this;
    }

    public HouseBuilder setColor(String color) {
        this.buildingDesign.setColor(color);
        return this;
    }

    public House build() {
        if (buildingDesign == null){
            return null;
        }else {
            return new House(buildingDesign);
        }
    }
}
