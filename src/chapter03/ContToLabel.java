package chapter03;

// Использование оператора continue с меткой.
class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for(int i=1; i < 10; i++) {
            System.out.print("\nПроход внешнего цикла #" + i +
                    ", внутренний цикл: ");
            for(int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop; // продолжить внешний цикл
                System.out.print(j);
            }
        }
    }
}
