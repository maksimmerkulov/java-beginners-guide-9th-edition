package chapter03;

// Демонстрация использования цикла do-while.
class DWDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        do {
            System.out.print("Нажмите клавишу и затем ENTER: ");
            ch = (char) System.in.read(); // получить символ
        } while(ch != 'q');
    }
}
