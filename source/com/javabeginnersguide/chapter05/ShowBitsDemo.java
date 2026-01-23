package com.javabeginnersguide.chapter05;

/*
  Упражнение 5.3.

  Класс, который отображает двоичное представление значения.
*/

class ShowBits { int numbits;
    ShowBits(int n) {
        numbits = n;
    }
    void show(long val) {
        long mask = 1;

        // Сдвиг влево значения 1 в нужную позицию.
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
// Демонстрация использования ShowBits.
class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("Двоичное представление значения 123: ");
        b.show(123);

        System.out.println("\nДвоичное представление значения 87987: ");
        i.show(87987);

        System.out.println("\nДвоичное представление значения 237658768: ");
        li.show(237658768);

        //Можно также отображать младшие биты любого целочисленного значения
        System.out.println("\nМладшие 8 битов значения 87987: ");
        b.show(87987);
    }
}
