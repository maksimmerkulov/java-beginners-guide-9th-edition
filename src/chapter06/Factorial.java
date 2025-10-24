package chapter06;

// Простой пример рекурсии.
class Factorial {
    // Рекурсивный метод.
    int factR(int n) {
        int result;

        if(n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    // Итеративный эквивалент рекурсивного метода.
    int factI(int n) {
        int t, result;

        result = 1;
        for(t=1; t <= n; t++) result *= t;
        return result;
    }
}
