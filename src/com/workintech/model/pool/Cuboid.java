package com.workintech.model.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    //width * length * height
    public double getVolume(){
        //super.getWidth()
        return height * super.getArea();
    }
}
