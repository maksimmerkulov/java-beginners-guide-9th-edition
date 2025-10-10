package chapter05;

// Демонстрация ряда операций со строками.
class StrOps {
    public static void main(String[] args) {
        String str1 = "В области программирования веб-приложений язык Java "
                + "занимает первое место.";
        String str2 = new String(str1);
        String str3 = "Строки Java крайне эффективны .";
        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        // Отобразить str1 посимвольно.
        for(int i=0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 равна str2");
        else
            System.out.println("str1 не равна str2");

        if(str1.equals(str3))
            System.out.println("str1 равна str3");
        else
            System.out.println("str1 не равна str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 и str3 равны");
        else if(result < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");

        // Присвоить str2 новую строку.
        str2 = "Один Два Три Один";

        idx = str2.indexOf("Один");
        System.out.println("Индекс первого вхождения подстроки Один: " + idx);
        idx = str2.lastIndexOf("Один");
        System.out.println("Индекс последнего вхождения подстроки Один: " + idx);
    }
}
