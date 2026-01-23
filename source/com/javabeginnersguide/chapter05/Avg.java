package com.javabeginnersguide.chapter05;

// Нахождение среднего для 10 значений типа double.
class Avg {
    public static void main(String[] args) {
        double[] nums = { 1.1, 2.2, 3.3, 4.4, 5.5,
                6.6, 7.7, 8.8, 9.9, 10.1 };
        double sum = 0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i];

        System.out.println("Среднее значение: " + sum / nums.length);
    }
}
