package by.epam.entity;

public class Ball {

    private String color;
    private double weight;
    private int id;

    private static int count = 0;

    {
        count++;
    }

    public Ball(String color, double weight) {
        this.color = color;
        this.weight = weight;
        this.id = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Ball)obj).id;
    }
}
