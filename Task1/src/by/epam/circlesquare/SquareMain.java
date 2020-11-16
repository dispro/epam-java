package by.epam.circlesquare;

import by.epam.circlesquare.entity.Square;
import by.epam.circlesquare.report.SquareReport;
import by.epam.circlesquare.service.SquareService;

public class SquareMain {

    public static void main(String[] args){
        Square externalSquare = new Square(26);
        SquareService squareService = new SquareService();
        Square insideSquare = new Square(squareService.getSquareInsideCircle(externalSquare));
        double comparing = squareService.compareAreas(externalSquare, insideSquare);
        SquareReport report = new SquareReport();
        report.printReport(externalSquare, insideSquare);
    }

}
