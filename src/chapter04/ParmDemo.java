package chapter04;

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - четное.");

        if(e.isEven(9)) System.out.println("9 - четное.");

        if(e.isEven(8)) System.out.println("8 - четное.");
    }
}
