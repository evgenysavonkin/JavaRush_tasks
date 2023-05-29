package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String text;
        while (true)//тут цикл по чтению ключей, пункт 1
        {
            text = reader.readLine();
            if (!text.equals("user") && !text.equals("loser") && !text.equals("coder") && !text.equals("proger")){
                break;
            }
            else{
                switch (text){
                    case "user":
                        person = new Person.User();
                        break;
                    case "loser":
                        person = new Person.Loser();
                        break;
                    case "coder":
                        person = new Person.Coder();
                        break;
                    case "proger":
                        person = new Person.Proger();
                        break;
                }
                doWork(person);
            }
            //создаем объект, пункт 2

             //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        } else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();
        } else if (person instanceof Person.Proger) {
            Person.Proger proger = (Person.Proger) person;
            proger.enjoy();
        }
    }
}
