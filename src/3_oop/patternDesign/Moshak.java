package 3_oop.patternDesign;

// this is kinds of design pattern.....

public abstract class Moshak {

  protected abstract void step1();

  protected abstract void step2();

  protected abstract void step3();

  public final void fire() {
    step1();
    step2();
    step3();
  }

}
