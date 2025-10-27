package chapter06;

class StaticError {
    int denom = 3;         // нормальная переменная экземпляра
    static int val = 1024; // статическая переменная

    /* Ошибка! Доступ к нестатической переменной
       внутри статического метода не разрешен. */
//    static int valDivDenom() {
//        return val/denom; // He скомпилируется!
//    }
}
