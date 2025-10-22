package chapter06;

// Возвращение объекта типа String.
class ErrorMsg {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Диск переполнен",
            "Индекс вышел за границы"
    };

    // Возвращает сообщение об ошибке.
    String getErrorMsg(int i) {
        if(i >=0 & i < msgs.length) return msgs[i];
        else return "Несуществующий код ошибки";
    }
}
