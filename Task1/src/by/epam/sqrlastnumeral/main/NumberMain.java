package by.epam.sqrlastnumeral.main;

import by.epam.sqrlastnumeral.entity.Number;
import by.epam.sqrlastnumeral.service.NumberService;
import by.epam.sqrlastnumeral.report.NumberReport;

import java.util.Scanner;

public class NumberMain {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Number number = new Number(scanner.nextInt());
        NumberService service = new NumberService();
        Number result = new Number(service.getLastNumberSqr(number).getNumber());
        NumberReport report = new NumberReport();
        report.printReport(number, result);
    }

}
