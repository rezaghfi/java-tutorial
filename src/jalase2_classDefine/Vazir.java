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

  public static void staticFunc() {
    System.out.println("ana static method");
  }


}
