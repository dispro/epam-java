package by.epam.countdays.service;

import by.epam.countdays.enity.MonthYearEntity;

public class MonthYearService {

    public int getCountMonthDays(MonthYearEntity monthYearEntity){
        int year = monthYearEntity.getYear();
        int month = monthYearEntity.getMonth();
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 31;
        }else if (month != 2){
            return 30;
        }else{
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) return 29;
            else return 28;
        }
    }
}
