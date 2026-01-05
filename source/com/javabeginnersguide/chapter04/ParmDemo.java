package com.javabeginnersguide.chapter04;

// Простой пример использования параметра.

class ChkNum {
    // Возвращает true, если значение x четное.
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - четное.");
        if(e.isEven(9)) System.out.println("9 - четное.");
        if(e.isEven(8)) System.out.println("8 - четное.");
    }
}
