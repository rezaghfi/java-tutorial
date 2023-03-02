package androidCourse;

public class Jalase5 {
    public static void main(String[] args){
        // object
        Sq s1 = new Sq(10,10,10,10);
        System.out.println(s1.mohit());
        //object
        Sq s2 = new Sq(10,34,45,6);
        //
        Child c1 = new Child();
        c1.ers();

        //

    }
}

class Fours{
    // attribute
    public int z1;
    public int z2;
    public int z3;
    public int z4;

    // constructor
     public Fours(int a, int b, int c, int d){
        this.z1 = a;
        this.z2 = b;
        this.z3 = c;
        this.z4 = d;
    }
    // method

    public int mohit(){
        int result = this.z1 + this.z2 + this.z3 + this.z4;
        return result;
    }

}
class Sq extends Fours{

    public Sq(int i, int i1, int i2, int i3) {
        super(i, i1, i2, i3);
    }
}
class Veg extends Fours{
    public Veg(int i, int i1, int i2, int i3) {
        super(i, i1, i2, i3);
    }
}
class Hoz extends Fours{
    public Hoz(int i, int i1, int i2, int i3) {
        super(i, i1, i2, i3);
    }
}
class Zoz extends Fours{
    public Zoz(int i, int i1, int i2, int i3) {
        super(i, i1, i2, i3);
    }
}
class Vehcile{
    public String model;
    public String caler;

    public void start(){
        System.out.println("Start");
    }

}
class Car extends Vehcile {

}
class Cycle extends Vehcile{

}
class Bus extends Vehcile{

}

abstract class Person{
    int age;
    abstract public void ers();
    public void func1(){
        System.out.println("hello");
    }
    public final void func2(){
        System.out.println("i'm func2");
    }
}
class Child extends Person{

    // override
    private int age;
    public void ers() {
        this.age = 10;
        System.out.println("i'm ers method in child class");
    }
//    public void func2(){
//
//    }
}

// abstract class

interface Animal{
    void soundAnimal();
    void run();
}

class cat implements Animal{

    public void soundAnimal(){

    }

    public void run(){

    }
}

final class aghim{
    int i;
}

//class child2 extends aghim{
//
//}