package j3_oop.patternDesign;

public class Test {
    public static void main(String[] args) {
        /////////////////////
        MoshakImp m = new MoshakImp();
        m.fire();
        // inline implementation. this wrong for instance. better instance aother class that extends from it.
        Moshak moshak = new Moshak() {
            @Override
            protected void step1() {
                System.out.println("ana step1 inline imp");
            }

            @Override
            protected void step2() {
                System.out.println("ana step2 inline imp");
            }

            @Override
            protected void step3() {
                System.out.println("ana step3 inline imp");
            }
        };
        moshak.fire();
    }
}
