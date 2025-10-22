package chapter06;

// Методам можно передавать объекты.
class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Возвращает true, если ob определяет ту же самую коробку.
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Возвращает true, если ob имеет тот же самый объем.
    boolean sameVolume(Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }
}
