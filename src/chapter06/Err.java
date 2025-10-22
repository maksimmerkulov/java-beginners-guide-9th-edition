package chapter06;

// Возвращает объект, определенный программистом.
class Err {
    String msg;   // сообщение об ошибке
    int severity; // код, отражающий уровень серьезности ошибки
    Err(String m, int s) {
        msg = m; severity = s;
    }
}
