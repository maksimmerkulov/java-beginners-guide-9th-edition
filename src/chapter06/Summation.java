package chapter06;

// Инициализация одного объекта с помощью другого.
class Summation {
    int sum;

    // Конструирование на основе значения типа int.
    Summation(int num) {
        sum = 0;
        for(int i=1; i <= num; i++)
            sum += i;
    }

    // Конструирование на основе другого объекта.
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
