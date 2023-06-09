package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
       // readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;
    static{
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planet = null;
        try {
            planet = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        if (planet.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        } else if (planet.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (planet.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else{
            thePlanet = null;
        }


        // implement step #5 here - реализуйте задание №5 тут
    }
}
