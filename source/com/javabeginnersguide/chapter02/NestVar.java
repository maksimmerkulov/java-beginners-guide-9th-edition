package com.javabeginnersguide.chapter02;

/*
  В этой программе предпринимается попытка объявить
  во внутренней области переменную с таким же именем,
  как у переменной, определенной во внешней области.

  *** Программа не скомпилируется. ***
*/
class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("Значение count: " + count);

            // int count;   // Не разрешено!!!
            for(count = 0; count < 2; count++)
                System.out.println("Программа содержит ошибку!");
        }
    }
}
