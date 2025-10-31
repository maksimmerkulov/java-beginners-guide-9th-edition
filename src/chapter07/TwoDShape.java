package chapter07;

// Использование методов доступа для установки и получения закрытых членов

// Класс для представления двумерных объектов.
class TwoDShape {
    private double width;  // Теперь это
    private double height; // закрытые члены.

    // Методы доступа для width и height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота: " +
                width + " и " + height);
    }
}
