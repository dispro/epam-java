package by.epam.countdays.report;

import by.epam.countdays.enity.MonthYearEntity;

public class MonthYearReport {

    public void printReport(MonthYearEntity monthYearEntity, int result){
        System.out.println("В " +
                monthYearEntity.getMonth() +
                " месяце " +
                monthYearEntity.getYear() + " года " +
                result + " дней.");
    }

}
