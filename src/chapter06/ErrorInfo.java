package chapter06;

class ErrorInfo {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Диск переполнен",
            "Индекс вышел за границы"
    };
    int[] howBad = { 3, 3, 2, 4 };

    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Несуществующий код ошибки", 0);
    }
}
