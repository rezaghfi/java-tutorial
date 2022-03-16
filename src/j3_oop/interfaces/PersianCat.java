package j3_oop.interfaces;

public class PersianCat extends Animal implements Persian,Cat{

  @Override
  public void b() {
    System.out.println("ana b in persian cat");
  }

  @Override
  public void c() {
    System.out.println("ana c in persian cat");
  }

  @Override
  public void sameMethod() {
    System.out.println("ana same default method and implement in persian cat");
  }

}
