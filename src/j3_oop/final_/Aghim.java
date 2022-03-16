package j3_oop.final_;

//!! you can not extend final class.
public final class Aghim {
  //!! the i property is constant value
  public final int i;

  public Aghim(int i) {
    this.i = i;
  }

  public final void a(){
    System.out.println("ana a and final method that i can't override");
  }
}


// this example is not possible.
// class Child extends Aghim{
//   public Child(int i) {
//     super(i);
//   }
// }
