package com.javabeginnersguide.chapter03;

// Изменение регистра букв.
class CaseChg {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;
        int changes = 0;

        System.out.println("Вводите символы; для останова введите точку.");
        do {
            ch = (char) System.in.read();
            if(ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if(ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while(ch != '.');
        System.out.println("Количество произошедших изменений регистра букв: " +
                changes);
    }
}
