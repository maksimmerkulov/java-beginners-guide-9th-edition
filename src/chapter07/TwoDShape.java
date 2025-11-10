package chapter07;

// Многоуровневая иерархия.
class TwoDShape {
    private double width;
    private double height;

    // Стандартный конструктор.
    TwoDShape() {
        width = height = 0.0;
    }

    // Параметризованный конструктор.
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Конструктор объекта с одинаковыми шириной и высотой.
    TwoDShape(double х) {
        width = height = х;
    }
    // Методы доступа для width и height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}
