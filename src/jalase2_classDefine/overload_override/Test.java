package jalase2_classDefine.overload_override;

public class Test {
  public static void main(String[] args) {

    MathProcessor math = new MathProcessor();
    math.process(10,39);
    int[] i = {1,34,5,56};
    math.process(i);

  }
}
