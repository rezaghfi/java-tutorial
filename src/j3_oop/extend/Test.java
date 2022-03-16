package j3_oop.extend;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            public void b() {
                System.out.println("ana b for parent inline implement");
            }
        };
        parent.b();
        Child child = new Child();
        child.b();
    }
}
