package chapter06;

// Аргументы переменной длины, перегрузка и неоднозначность.
//
// Эта программа содержит ошибку и не скомпилируется!
class VarArgs4 {

    // Использование параметра переменной длины типа int.
    static void vaTest(int ... v) {
        // ...
    }

    // Использование параметра переменной длины типа boolean.
    static void vaTest(boolean ... v) {
        // ...
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);             // Нормально
        vaTest(true, false, false);  // Нормально
        // vaTest();                     // Ошибка: Неоднозначность!
    }
}
