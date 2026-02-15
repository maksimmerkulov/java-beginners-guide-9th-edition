package com.javabeginnersguide.chapter02;

// Демонстрация автоматического преобразования из long в double.
class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D: " + L + " " + D);
    }
}
