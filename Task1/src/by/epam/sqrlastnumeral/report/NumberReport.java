package by.epam.sqrlastnumeral.report;

import by.epam.sqrlastnumeral.entity.Number;

public class NumberReport {

    public void printReport(Number srcNum, Number result){
        System.out.println("Source Number:\t" + srcNum
                + "\nResult Number:\t" + result);
    }

}
