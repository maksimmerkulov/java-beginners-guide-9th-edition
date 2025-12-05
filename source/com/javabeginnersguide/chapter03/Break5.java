package com.javabeginnersguide.chapter03;

// Еще один пример использования оператора break с меткой.
class Break5 {
    public static void main(String[] args) {

        done:
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done;  // переход по метке done
                }
                System.out.println("После цикла k");    // не выполнится
            }
            System.out.println("После цикла j");        // не выполнится
        }
        System.out.println("После цикла i");
    }
}
