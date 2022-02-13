package jalase3_OOP;
import jalase3_OOP.final_.Aghim;
import jalase3_OOP.interfaces.Cat;
import jalase3_OOP.interfaces.Persian;
import jalase3_OOP.interfaces.PersianCat;
import jalase3_OOP.patternDesign.*;
import jalase3_OOP.extend.*;

public class Main {
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
    /////////////////////
    MoshakImp m = new MoshakImp();
    m.fire();
    // inline implementation.
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
    /////////////
    Aghim aghim = new Aghim(12);
    // aghim.i = 23; it is not correct because I is final in Aghim class.
    // aghim.a() is final and it can not override.
    aghim.a();
    ///////////////////////////
    PersianCat tommy = new PersianCat();
    tommy.a();
    tommy.b();
    tommy.c();
    tommy.cat();
    tommy.persian();
    tommy.shared();
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
    //////////////////////////// functional programming
    Cat.myFunc();
    // Cat::myFunc;

  }
}
