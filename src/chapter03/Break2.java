package chapter03;

// Чтение пользовательского ввода, пока не будет получена буква q.
class Break2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        for( ; ; ) {

            ch = (char) System.in.read(); // получить символ
            if(ch == 'q') break;
        }
        System.out.println("Была нажата клавиша q!");
    }
}
