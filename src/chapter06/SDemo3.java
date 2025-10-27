package chapter06;

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора.");

        System.out.println("Квадратный корень 2: " +
                StaticBlock.rootOf2);
        System.out.println("Квадратный корень 3: " +
                StaticBlock.rootOf3);
    }
}
