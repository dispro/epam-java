package by.epam.circlesquare.entity;

public class Square {

    private double squareArea;

    public Square(double squareArea) {
        this.squareArea = squareArea;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareArea=" + squareArea +
                '}';
    }
}
