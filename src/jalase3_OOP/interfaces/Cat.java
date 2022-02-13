package jalase3_OOP.interfaces;

public interface Cat {
  public void a();
  public void b();
  public default void cat(){
    System.out.println("ana defult method in cat interfce with body");
  }
  public default void shared(){
    System.out.println("ana same default method");
  }

  public static void myFunc(){
    System.out.println("ana functional programming in java 8");
  }
}
