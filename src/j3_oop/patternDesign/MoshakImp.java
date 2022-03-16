package j3_oop.patternDesign;

// abstract implementation pattern.
public class MoshakImp extends Moshak {

  @Override
  protected void step1() {
    System.out.println("ana step one of moshak implementation that is amade sazi");
  }

  @Override
  protected void step2() {
    System.out.println("ana step two of moshak implementation that is neshne geri");
  }

  @Override
  protected void step3() {
    System.out.println("ana step three of moshak implementation that is partap moshak");
  }
}
