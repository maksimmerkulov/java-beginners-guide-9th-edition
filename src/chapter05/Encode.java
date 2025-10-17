package chapter05;

// Более совершенное использование операции исключающего ИЛИ
// для кодирования и декодирования сообщения.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // Закодировать сообщение.
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
        }

        System.out.print("Закодированное сообщение: ");
        System.out.println(encmsg);

        // Декодировать сообщение.
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
        }

        System.out.print("Декодированное сообщение: ");
        System.out.println(decmsg);
    }
}
