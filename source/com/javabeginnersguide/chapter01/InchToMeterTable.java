package com.javabeginnersguide.chapter01;

/*
  Эта программа отображает таблицу преобразований дюймов в метры.
  Назовите этот файл InchToMeterTable.java.
*/
class InchToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;    // преобразовать в метры
            System.out.println(inches + " дюймов соответствуют " +
                    meters + " метрам.");

            counter++;
            // После каждой 12-й строки выводить пустую строку.
            if(counter == 12) {
                System.out.println();
                counter = 0;    // сбросить счетчик строк
            }
        }
    }
}
