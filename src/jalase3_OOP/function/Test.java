package jalase3_OOP.function;

public class Test {
    public static void main(String[] args) {
        //////////////////////////// functional programming
        FunctionalInterface.myFunc();
        Runnable myFunc = FunctionalInterface::myFunc;
        FunctionalInterface f = new FunctionalInterface() {
            @Override
            public void imp() {
                FunctionalInterface.super.imp();
            }
        };
        f.imp();
    }

}