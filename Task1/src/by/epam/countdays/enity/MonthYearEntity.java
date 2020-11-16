package by.epam.countdays.enity;

public class MonthYearEntity {

    private int month;
    private int year;

    public MonthYearEntity(int month, int year){
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MonthYearEntity{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }
}
