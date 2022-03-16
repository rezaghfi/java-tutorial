package j3_oop.final_;

public class Test {
    public static void main(String[] args) {
        /////////////
        Aghim aghim = new Aghim(12);
        // aghim.i = 23; it is not correct because I is final in Aghim class.
        // aghim.a() is final and it can not override.
        aghim.a();
    }
}
