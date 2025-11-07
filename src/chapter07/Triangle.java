package chapter07;

// Подкласс TwoDShape для представления треугольников.
class Triangle extends TwoDShape {
    private String style;

    // Конструктор.
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Стиль треугольника: " + style);
    }
}
