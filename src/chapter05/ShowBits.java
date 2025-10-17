package chapter05;

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
