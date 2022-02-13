package jalase3_OOP.interfaces;

public interface Persian {
  public void a();
  public void c();
  public default void persian(){
      System.out.println("ana default method in persian interfce with body");
  }
  public default void shared(){
    System.out.println("ana same default method");
  }
}
