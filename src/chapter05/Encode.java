package chapter05;

// Использование операции исключающего ИЛИ для кодирования
// и декодирования сообщения.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // Закодировать сообщение.
        for(int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Закодированное сообщение: ");
        System.out.println(encmsg);

        // Декодировать сообщение.
        for(int i=0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Декодированное сообщение: ");
        System.out.println(decmsg);
    }
}
