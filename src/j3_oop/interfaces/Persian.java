package j3_oop.interfaces;

public interface Persian {
  public void a();
  public void c();
  public default void persian(){
      System.out.println("ana default method in persian interfce with body");
  }
  public default void sameMethod(){
    System.out.println("ana same default method");
  }
}
