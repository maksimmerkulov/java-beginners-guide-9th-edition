package chapter06;

// Класс, представляющий стек для символов.
class Stack {
    private char[] stck;        // массив, хранящий данные стека
    private int tos;            // верхушка стека

    // Конструктор пустого стека заданного размера.
    Stack(int size) {
        stck = new char[size];  // выделение памяти под стек
        tos = 0;
    }

    // Конструктор стека из объекта Stack.
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // Копировать элементы.
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Конструктор стека с начальными значениями.
    Stack(char[] a) {
        stck = new char[a.length];

        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // Поместить символ в стек.
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" -- Стек переполнен.");
            return;
        }

        stck[tos] = ch; tos++;
    }

    // Извлечь символ из стека.
    char pop() {
        if(tos==0) {
            System.out.println(" -- Стек пуст.");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}
