package chapter05;

// Демонстрация использования ShowBits.
class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("Двоичное представление значения 123: ");
        b.show(123);

        System.out.println("\nДвоичное представление значения 87987: ");
        i.show(87987);

        System.out.println("\nДвоичное представление значения 237658768: ");
        li.show(237658768);

        //Можно также отображать младшие биты любого целочисленного значения
        System.out.println("\nМладшие 8 битов значения 87987: ");
        b.show(87987);
    }
}
