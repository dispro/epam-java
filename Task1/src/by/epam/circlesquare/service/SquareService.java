package by.epam.circlesquare.service;

import by.epam.circlesquare.entity.Square;

public class SquareService {

    private double getSideSquare(Square square){
        double side = Math.sqrt(square.getSquareArea());
        return side;
    }

    public double getSquareInsideCircle(Square square){
        double side = this.getSideSquare(square);
        double sideInsideSquare = side / Math.sqrt(2);
        double area = Math.sqrt(sideInsideSquare);
        return area;
    }

    public double compareAreas(Square sqr1, Square sqr2){
        double comparing = sqr1.getSquareArea() / sqr2.getSquareArea();
        return comparing;
    }

}
