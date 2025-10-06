package chapter05;

// Демонстрация выхода индекса за границы массива.
class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        // Выход индекса за границы массива.
        for(i = 0; i < 100; i = i+1)
            sample[i] = i;
    }
}
