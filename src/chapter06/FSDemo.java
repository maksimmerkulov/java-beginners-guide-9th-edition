package chapter06;

// Демонстрация работы "отказоустойчивого" массива.
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Отобразить отказы без отчета.
        System.out.println("Обработка ошибок без отчета.");
        for(int i=0; i < (fs.length * 2); i++)
            fs.put(i, i*10);

        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        // Отработать отказы.
        System.out.println("\nОбработка ошибок с отчетом.");
        for(int i=0; i < (fs.length * 2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Индекс " + i + " выходит за границы массива");

        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " выходит за границы массива");
        }
    }
}
