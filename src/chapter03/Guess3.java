package chapter03;

// Игра в угадывание буквы, версия 3.
class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Задумана буква между А и Z.");
        System.out.print("Попробуйте ее угадать: ");
        ch = (char) System.in.read(); // чтение символа с клавиатуры

        if(ch == answer) System.out.println("** Правильно **");
        else {
            System.out.print("...Увы, не угадали. Задуманная буква находится ");

            // Вложенный оператор if.
            if(ch < answer) System.out.println("дальше по алфавиту.");

            else System.out.println("ближе по алфавиту.");
        }
    }
}
