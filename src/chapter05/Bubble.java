package chapter05;

/*
  Упражнение 5.1.

  Сортировка массива.
*/

class Bubble {
    public static void main(String[] args) {
        int[] nums = { 99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49 };
        int a, b, t;
        int size;

        size = 10; // количество сортируемых элементов

        // Отобразить исходный массив.
        System.out.print("Исходный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Пузырьковая сортировка.
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(nums[b-1] > nums[b]) { // Если порядок следования не соблюден,
                                          // тогда поменять элементы местами.
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        // Отобразить отсортированный массив.
        System.out.print("Отсортированный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
