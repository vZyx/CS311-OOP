
package com.mycompany.week5;


public class Rectangle {

    double width;
    double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double NewWidth, double NewHeight) {
        this.width = NewWidth;
        this.height = NewHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}
