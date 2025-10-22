package chapter06;

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity);
    }
}
