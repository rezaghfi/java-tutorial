package jalase2_classDefine;

public class Vazir {
  // static property
  //public, private, protected, non-access accesses
  public static String countryName = "iran";
  public static String dolat;
  public String firstName;
  public String lastName;
  public String hairColor;
  public int age;

  // حتما باید این سازنده را تعریف کنید
  public Vazir() {

  }

  public Vazir(String firstName){
    this.firstName = firstName;
  }

  public Vazir(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public void antekhabeMoaven() {
    System.out.println("ana antekhabeMoaven");
  }

  public void antekhabeMonshi() {
    System.out.println("ana antekhabeMonshi");
  }

  // overloaded Methods
  public void sum(int x, int y) {
    System.out.println("summation of " + x + " + " + y + " = " + (x + y));
  }

  public void sum(double x, double y) {
    System.out.println("summation of " + x + " + " + y + " = " + (x + y));
  }

  public void sum(int x, int y, int z) {
    System.out.println("summation of " + x + " + " + y + " + " + z + " = " + (x + y + z));
  }

  public int sum(int x, int y, int z, int f) {
    System.out.println("firstName is = " + this.firstName);
    return x + y + z + f;
  }

  public static void staticFunc() {
    System.out.println("ana static method");
  }


}
