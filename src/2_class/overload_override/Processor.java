package 2_class.overload_override;

import java.util.Arrays;

public class Processor {
  // there are three overloaded constructor
  public void process(int i, int j){
    System.out.printf("Processing two integer: %d , %d", i, j);
  }

  public void process(int[] ints){
    System.out.println("Adding integer array:" + Arrays.toString(ints));
  }

  public void process(Object[] objs){
    System.out.println("Adding integer array: + " + Arrays.toString(objs));
  }
}

class MathProcessor extends Processor{
  // there are two method of processor that override
  @Override
  public void process(int i, int j){
    System.out.println("Sumation of "+i+" and "+j+": "+(i+j));
  }

  @Override
  public void process(int[] ints) {
    int sum = 0;
    for(int h : ints){
        sum += h;
    }
    System.out.println("Sum of Array Integer elements: "+sum);
  }

  @Override
  public void process(Object[] objs) {
    System.out.println("object elements is: "+objs.toString());
  }

}
