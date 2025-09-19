package chapter03;

// Части цикла for могут быть пустыми.
class Empty {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10; ) {
            System.out.println("Проход #" + i);
            i++; // инкрементирование переменной управления циклом
        }
    }
}
