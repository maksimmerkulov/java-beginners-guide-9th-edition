package chapter05;

// Использование выведения типов локальных переменных в цикле for.
class VarDemo3 {
    public static void main(String[] args) {

        // Применить выведение типов к переменной управления циклом.
        System.out.print("Значения x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        // Применить выведение типов к переменной итерации.
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Значения в массиве nums: ");
        for(var v : nums)
            System.out.print(v + " ");

        System.out.println();
    }
}
