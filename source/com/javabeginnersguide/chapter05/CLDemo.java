package com.javabeginnersguide.chapter05;

// Отображение всех аргументов командной строки.
class CLDemo {
    public static void main(String[] args) {
        System.out.println("Количество аргументов, переданных программе: "
                + args.length);
        System.out.println("Список аргументов: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
