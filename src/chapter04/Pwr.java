package chapter04;

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
        return val;
    }
}
