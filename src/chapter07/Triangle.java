package chapter07;

// Подкласс TwoDShape для представления треугольников.
class Triangle extends TwoDShape {
    private String style;

    // Стандартный конструктор.
    Triangle() {
        super();
        style = "отсутствует";
    }
    // Конструктор класса Triangle.
    Triangle(String s, double w, double h) {
        super(w, h); // вызов конструктора суперкласса
        style = s;
    }
    // Конструктор с одним аргументом.
    Triangle(double х) {
        super(х); // вызов конструктора суперкласса
        style = "закрашенный";
    }
    // Конструктор объекта из объекта.
    Triangle(Triangle ob) {
        super(ob); // передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Стиль треугольника: " + style);
    }
}
