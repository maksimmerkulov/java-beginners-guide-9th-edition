package chapter07;

// Добавление конструктора к Triangle.

// Класс для представления двумерных объектов.
class TwoDShape {
    private double width; // Теперь это
    double height;        // закрытые члены.

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
