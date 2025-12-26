package com.javabeginnersguide.chapter02;

// Побочные эффекты могут быть важны.
class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        /* Здесь i все равно инкрементируется, несмотря на то,
           что условие в операторе if дает false. */
        if(false & (++i < 100))
            System.out.println("He отображается");
        System.out.println("Оператор if выполняется: " + i);
        // i имеет значение 1

        /* В данном случае i не инкрементируется, поскольку
           короткозамкнутая операция пропускает инкрементирование. */
        if(false && (++i < 100))
            System.out.println("He отображается");
        System.out.println("Оператор if выполняется: " + i);
        // i по-прежнему имеет значение 1!
    }
}
