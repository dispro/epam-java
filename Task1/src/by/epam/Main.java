package by.epam;

import by.epam.countdays.enity.MonthYearEntity;
import by.epam.countdays.report.MonthYearReport;
import by.epam.countdays.service.MonthYearService;

public class Main {

    public static void main(String[] args) {
        MonthYearEntity monthYearEntity = new MonthYearEntity(2, 2000);
        MonthYearService monthYearService = new MonthYearService();
        int result = monthYearService.getCountMonthDays(monthYearEntity);
        MonthYearReport monthYearReport = new MonthYearReport();
        monthYearReport.printReport(monthYearEntity, result);
    }
}
