package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        //clock.join();

        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }
        Thread current = Thread.currentThread();
        public void run() {
            try {
                while ( numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                    } else {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                //if (numSeconds != 4){
                    System.out.println("Прервано!");
                //}
            }
/*            if (numSeconds >= 3.5){
                while (!current.isInterrupted() ){
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        System.out.println("Прервано!");
                        current.interrupt();
                    }
*//*                    if (numSeconds == 0){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                        System.out.print("Прервано!");
                        current.interrupt();
                    }*//*
                }
            } else if (numSeconds < 3.5){
                while (!current.isInterrupted() && numSeconds > 0){
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                }
                System.out.print("Марш!");
            }*/


/*            if (numSeconds >= 3.5){
                while (!current.isInterrupted()){
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.print("Прервано!");
                        current.interrupt();
                    }
                }
            } else if (numSeconds < 3.5){

            }*/
            //add your code here - добавь код тут
        }
    }
}
