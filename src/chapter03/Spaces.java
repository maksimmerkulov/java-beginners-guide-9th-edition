package chapter03;

// Подсчет пробелов.
class Spaces {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;
        int spaces = 0;

        System.out.println("Вводите символы; для останова введите точку.");

        do {
            ch = (char) System.in.read();
            if(ch == ' ') spaces++;
        } while(ch != '.');

        System.out.println("Количество пробелов: " + spaces);
    }
}
