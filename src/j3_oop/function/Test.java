package j3_oop.function;

public class Test {
    public static void main(String[] args) {
        //////////////////////////// functional programming
        FunctionalInterface.myFunc();
        Runnable myFunc = FunctionalInterface::myFunc;
        //  object orient programming
        FunctionalInterface f = new FunctionalInterface() {
            @Override
            public void imp() {
                FunctionalInterface.super.imp();
            }
        };
        f.imp();
    }
}
