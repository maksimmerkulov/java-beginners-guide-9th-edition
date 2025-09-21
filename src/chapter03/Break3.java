package chapter03;

// Использование break с вложенными циклами.
class Break3 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            System.out.println("Счетчик внешнего цикла: " + i);
            System.out.print("    Счетчик внутреннего цикла: ");
            int t = 0;
            while(t < 100) {
                if(t == 10) break; // прекратить выполнение цикла, если t равно 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
