package com.javabeginnersguide.chapter03;

/*
  Использование цикла for для генерации
  последовательности 1 2 4 8 16 ...
*/
class Progress {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i += i)
            System.out.print(i + " ");
    }
}
