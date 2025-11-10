package chapter07;

// Класс, расширяющий TwoDShape.
class Triangle extends TwoDShape {
    private String style;

    // Стандартный конструктор.
    Triangle() {
        super();
        style = "отсутствует";
    }

    Triangle(String s, double w, double h) {
        super(w, h); // вызов конструктора суперкласса
        style = s;
    }

    // Конструктор с одним аргументом.
    Triangle(double х) {
        super(х); // вызов конструктора суперкласса
        style = "закрашенный";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Стиль треугольника: " + style);
    }
}
