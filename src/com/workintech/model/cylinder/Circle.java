package com.workintech.model.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
        /*if(radius < 0){
            this.radius = 0;
        } else{
            this.radius = radius;
        }*/
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
//        return Math.pow(this.radius, 2) * Math.PI;
    }


}
