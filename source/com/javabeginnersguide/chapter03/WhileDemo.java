package com.javabeginnersguide.chapter03;

// Демонстрация применения цикла while.
class WhileDemo {
    public static void main(String[] args) {
        char ch;
        // Вывести буквы английского алфавита, используя цикл while.
        ch = 'a';
        while(ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
