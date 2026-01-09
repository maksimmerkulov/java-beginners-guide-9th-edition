package com.javabeginnersguide.chapter04;

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double b, int e) {
        this.b = b;

        this.e = e;

        val = 1;
        if(e==0) return;
        for( ; e>0; e--) val = val * b;
    }

    double getVal() {
        return this.val;
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
