package jalase3_OOP.interfaces;

public interface Cat {
  public void a();
  public void b();
  public default void myFunc(){
    System.out.println("ana defult method in interfce with body");
  }
}
