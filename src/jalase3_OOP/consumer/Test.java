package jalase3_OOP.consumer;

import java.util.function.Consumer;

/**
 * Created by Bahador-PC on 2/8/2018.
 */
public class Test {
  public static void main(String[] args) throws Exception {
    jimbo(Runable::test2);
    jimbo(Runable2::test);
  }

  //jimbo with consumer input
  public static void jimbo(Consumer consumer) {
    System.out.println("before");
    consumer.accept("jimbo with java consumer");
    System.out.println("after");
  }
  // overloaded jimbo with customize consumer
  public static void jimbo(MyConsumer myConsumer){
    System.out.println("before");
    myConsumer.execute("input1","input2");
    System.out.println("after");
  }
}