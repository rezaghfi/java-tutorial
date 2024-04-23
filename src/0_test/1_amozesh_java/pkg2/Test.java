package androidCourse.pkg2;
import androidCourse.pkg1.acess;

public class Test {
    public static void main(String[] args) {
        acess a = new acess();
        a.i = 10;

    }
}

class acess4 extends acess{
    void func(){
        acess a =new acess();
        a.i = 12;
    }
}
