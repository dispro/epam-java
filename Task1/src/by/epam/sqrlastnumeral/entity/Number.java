package by.epam.sqrlastnumeral.entity;

public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + this.number;
    }
}
