package jalase3_OOP.interfaces;

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
  public void shared() {
    System.out.println("ana same default method and implement in persian cat");
  }

}
