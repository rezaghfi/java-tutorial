package jalase3_OOP.consumer;

import java.util.function.Consumer;

/**
 * Created by Bahador-PC on 2/8/2018.
 */
public class Test {
  public static void main(String[] args)throws  Exception {
    jimbo(Consu::test2);
  }
  //two programmer that programmer one just write jimbo and he dont know about function amirsam.
  public static void jimbo(Consumer consumer)
  {
    System.out.println("before");
    consumer.accept("amirsam");
    System.out.println("after");
  }
}