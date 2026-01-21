package com.javabeginnersguide.chapter05;

// Использование выведения типов локальных переменных
// с классами, определенными пользователем.
class MyClass {
    private int i;

    MyClass(int k) { i = k; }

    int geti() { return i; }
    void seti(int k) { if(k >= 0) i = k; }
}

class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10);   // Обратите внимание на применение var.

        System.out.println("Значение i в mc равно " + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в mc теперь равно " + mc.geti());
    }
}
