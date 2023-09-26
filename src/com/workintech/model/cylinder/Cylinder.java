package com.workintech.model.cylinder;

import com.workintech.model.cylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height<0)?0:height;
        /*if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }*/
    }
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
