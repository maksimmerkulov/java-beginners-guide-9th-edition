package com.javabeginnersguide.chapter02;

// Демонстрация работы операций отношения и логических операций.
class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("He выполнится.");
        if(i >= j) System.out.println("He выполнится.");
        if(i > j) System.out.println("He выполнится.");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("He выполнится.");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) дает true");
        if(b1 | b2) System.out.println("b1 | b2 дает true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 дает true");
    }
}
