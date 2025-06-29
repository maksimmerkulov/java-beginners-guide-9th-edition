package com.javabeginnersguide.chapter05;

// Использование цикла for в стиле "for-each".
class ForEach {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Суммировать только первые 5 элементов.
        for(int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if(x == 5) break; //остановить работу цикла, когда x получает значение 5
        }

        System.out.println("Сумма: " + sum);
    }
}
