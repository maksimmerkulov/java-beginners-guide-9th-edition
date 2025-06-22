package com.javabeginnersguide.chapter04;

class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base, int exp) {
        b = base;
        e = exp;
        val = 1;
        if(exp==0) return;
        for( ; exp>0; exp--) val = val * base;
    }

    double getVal() {
        return val;
    }
}
class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " в степени " + x.e +
                " равно " + x.getVal());
        System.out.println(y.b + " в степени " + y.e +
                " равно " + y.getVal());
        System.out.println(z.b + " в степени " + z.e +
                " равно " + z.getVal());
    }
}
