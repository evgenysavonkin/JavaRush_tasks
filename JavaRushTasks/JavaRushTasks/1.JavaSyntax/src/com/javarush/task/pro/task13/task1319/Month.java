package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] winter = new Month[3];
        winter[0] = DECEMBER;
        winter[1] = JANUARY;
        winter[2] = FEBRUARY;
        return winter;
    }
    public static Month[] getSpringMonths(){
        Month[] spring = new Month[3];
        spring[0] = MARCH;
        spring[1] = APRIL;
        spring[2] = MAY;
        return spring;
    }
    public static Month[] getSummerMonths(){
        Month[] summer = new Month[3];
        summer[0] = JUNE;
        summer[1] = JULY;
        summer[2] = AUGUST;
        return summer;
    }
    public static Month[] getAutumnMonths(){
        Month[] autumn = new Month[3];
        autumn[0] = SEPTEMBER;
        autumn[1] = OCTOBER;
        autumn[2] = NOVEMBER;
        return autumn;
    }


}
