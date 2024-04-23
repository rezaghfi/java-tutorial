package androidCourse.pkg1;

public class acess {
    public int i = 0;
    private int i1 = 0;
    protected int i2 = 0;
    int i3 = 0;

    void func(){
        this.i = 0;
        this.i1 = 1;
        this.i2 = 5;
    }
}

 class acess2 extends acess{
    void func(){
        acess a = new acess();
        a.i2 = 12;
    }

 }

 class acess3{

    void func(){
        acess a = new acess();
        a.i = 0;
        a.i2 = 4;
        a.i3 =34;
    }
 }



