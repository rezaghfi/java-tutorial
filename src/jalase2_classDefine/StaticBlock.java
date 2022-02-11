package jalase2_classDefine;

public class StaticBlock {

  public StaticBlock() {
    System.out.println("ana constructor");
  }

  static {
    System.out.println("ana static block and i call once when class loader allocate class in metaspace");
    System.out.println("you can load library of c, c++ or another language in this block");
  }

  public static void staticMethod() {
    System.out.println("static method");
  }
}
