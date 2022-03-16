package j3_oop.function;

public interface FunctionalInterface {
  public static void myFunc(){
    System.out.println("ana functional programming in java 8");
  }
  default void imp(){
    System.out.println("ana method in interface and but static method cant access with object");
  }
}

