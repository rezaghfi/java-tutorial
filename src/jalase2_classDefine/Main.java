package jalase2_classDefine;

//import java.util.Scanner;
import jalase2_classDefine.iran.*;
public class Main {
  public static void main(String[] args) {
    int x = 12, y = 12, z = 12, f = 12;
    // vazir instanse
    Vazir naft = new Vazir();
    Vazir omor = new Vazir();
    Vazir it = new Vazir("essa");
    Vazir kar = new Vazir("hojatollah", "abdolmaleki");
    naft.antekhabeMoaven();
    omor.antekhabeMonshi();
    naft.firstName = "javad";
    naft.lastName = "oji";
    omor.firstName = "hossein";
    omor.lastName = "AmirAbdollahean";
    naft.sum(12, 23);
    naft.sum(12, 12, 12);
    naft.sum(12.3, 12.3);
    int result = naft.sum(x, y, z, f);
    System.out.println("summation of " + x + " + " + y + " + " + z + " + " + f + " = " + result);
    System.out.println("vazir naft fist and last Name are: " + naft.firstName +" "+ naft.lastName);
    System.out.println("vazir kar fist and last Name are: " + kar.firstName +" " + kar.lastName);
    System.out.println("Vazir's Country Name is= " + Vazir.countryName + "\nVazir naft country Name is = " + naft.countryName);
    Vazir.dolat = "Raisi";
    omor.countryName = "iraq";
    System.out.println("Vazir's Country Name is= " + Vazir.countryName + "\nVazir naft country Name is = " + naft.countryName);
    Vazir.staticFunc();

    //////////////////////////////////////// memory allocation ////////////////////////
    new StaticBlock();
    new StaticBlock();
    new StaticBlock();
    StaticBlock.staticMethod();




    ///////////////////////// import
    Test test1 = new Test();
    jalase2_classDefine.america.Test test2 = new jalase2_classDefine.america.Test();
    jalase2_classDefine.iran.tehran.Test test3 = new jalase2_classDefine.iran.tehran.Test();




  }
}
