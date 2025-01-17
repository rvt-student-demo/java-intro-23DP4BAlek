package lv.rvt;

public class Box {

    public double length;
    public double height;
    public double width;

    public Box(double width, double height, double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * (width * height + length * width + height * length);
    }



}
