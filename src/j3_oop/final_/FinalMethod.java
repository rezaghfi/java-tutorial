package j3_oop.final_;

public class FinalMethod {
    FinalMethod() {
    }

    public final void finalMethod(){
        System.out.println("ana final method and any one can not override me");
    }

    public void notFinalMethod(){
        System.out.println("ana not  final and override me");
    }
}
