package jalase2_classDefine;

public class Calculator {
  public Calculator() {
    System.out.println("ana initialize");
  }

  static {
    System.out.println("ana loaded");
  }

  public void sum(double x, double y) {
    System.out.println("summation of " + x + " + " + y + " = " + (x + y));
  }

  public void sub(double x, double y) {
    System.out.println("summation of " + x + " - " + y + " = " + (x - y));
  }

  public void mul(double x, double y) {
    System.out.println("summation of " + x + " * " + y + " = " + (x * y));
  }

  public void div(double x, double y) {
    System.out.println("summation of " + x + " / " + y + " = " + (x / y));
  }
}
