package j3_oop.interfaces;

public interface Cat {
  public void a();
  public void b();
  public default void cat(){
    System.out.println("ana defult method in cat interfce with body");
  }
  public default void sameMethod(){
    System.out.println("ana same default method");
  }

}
