package com.javabeginnersguide.chapter03;

// Демонстрация использования цепочки if-else-if.
class Ladder {
    public static void main(String[] args) {
        int x;
        for(x=0; x<6; x++) {
            if(x==1)
                System.out.println("Значение x равно 1");
            else if(x==2)
                System.out.println("Значение x равно 2");
            else if(x==3)
                System.out.println("Значение x равно 3");
            else if(x==4)
                System.out.println("Значение x равно 4");
            else
                System.out.println("Значение x не находится "
                        + "между 1 и 4");
        }
    }
}
