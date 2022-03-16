package j3_oop.lambda;


interface Drawable {
  public void draw();
}

interface Sayable {
  public String say();
}

interface Seeable {
  public String see(String name);
}

interface Addable{
  int add(int a, int b);
}

public class LambdaExpressionExample {
  public static void main(String[] args) {
    int witdh = 19;
    // without lambda
    Drawable d1 = new Drawable() {
      @Override
      public void draw() {
        System.out.println("ana implementation without lambda");
      }
    };

    //with lambda
    Drawable d2 = () -> System.out.println("ana lamada implentation");
    Drawable d3 = () -> {
      int i = 9;
      System.out.println("ana reza and l like programming");
      System.out.println("ana hasan and i dont like programming");
    };

    // return expression
    Sayable s = () -> {
      return "I have nothing to say";
    };

    // single parameter
    Seeable s2 = (name) -> {
      return "Hello " + name;
    };

    Seeable s3 = name -> {
      return ("Hello my friend " + name);
    };
    System.out.println(s3.see("reza"));

    // multiple parameter without return keyword.
    Addable ad1 = (a, b) -> (a+b);
    System.out.println("10 + 3 = " + ad1.add(10,3));

    Addable ad2 = (int a, int b) -> (a+b);
    System.out.println("23 + 45 = " + ad2.add( 23,45));
  }
}