package com.javabeginnersguide.chapter05;

// Использование цикла for в стиле "for-each" для двумерного массива.
class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // Поместить некоторые значения в nums.
        for(int i = 0; i < 3; i++)
            for(int j=0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // Применение цикла for в стиле "for-each" для отображения
        // и суммирования значений.
        for(int[] x : nums) {
            for(int y : x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
