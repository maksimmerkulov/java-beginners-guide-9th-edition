package com.javabeginnersguide.chapter03;

/*
  Использование вложенного цикла для нахождения множителей чисел от 2 до 100.
*/
class FindFac {
    public static void main(String[] args) {

        for(int i=2; i <= 100; i++) {
            System.out.print("Множители " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}
