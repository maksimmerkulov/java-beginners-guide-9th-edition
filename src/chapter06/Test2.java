package chapter06;

// Объекты передаются через ссылки на них.
class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    /* Передается объект. Теперь ob.a и ob.b в объекте,
       используемом при вызове, будут изменены. */
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
