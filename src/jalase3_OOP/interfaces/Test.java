package jalase3_OOP.interfaces;

public class Test {
    public static void main(String[] args) {
        ///////////////interface////////////
        PersianCat tommy = new PersianCat();
        tommy.a();
        tommy.b();
        tommy.c();
        tommy.cat();
        tommy.persian();
        tommy.sameMethod();
        Persian reza = new Persian() {
            @Override
            public void a() {
                System.out.println("ana implementation of a");
            }

            @Override
            public void c() {
                System.out.println("ana implementation of b");
            }
        };
    }
}
