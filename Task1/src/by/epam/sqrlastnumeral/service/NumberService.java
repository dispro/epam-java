package by.epam.sqrlastnumeral.service;

import by.epam.sqrlastnumeral.entity.Number;

public class NumberService {

    public Number getLastNumber(Number number){
        return new Number(number.getNumber() % 10);
    }

    public Number getLastNumberSqr(Number number){
        Number sqr = new Number((int)Math.pow(number.getNumber(), 2));
        return this.getLastNumber(sqr);
    }
}
