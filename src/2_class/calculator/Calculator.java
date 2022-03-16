package 2_class.calculator;

public class Calculator {
  public Calculator() {
    System.out.println("calculator initialize in memory");
  }

  static {
    System.out.println("calculator loaded in metaspace");
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
