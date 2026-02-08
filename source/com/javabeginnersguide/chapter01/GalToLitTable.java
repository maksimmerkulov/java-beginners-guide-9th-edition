package com.javabeginnersguide.chapter01;

/*
  Упражнение 1.2.
  Эта программа отображает таблицу преобразований галлонов в литры.
  Назовите этот файл GalToLitTable.java.
*/
class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;  // преобразование в литры
            System.out.println(gallons + " галлонов соответствует " +
                    liters + " литрам.");

            counter++;
            // После каждой 10-й строки вывести пустую строку.
            if(counter == 10) {
                System.out.println();
                counter = 0;    // сброс счетчика строк
            }
        }
    }
}
