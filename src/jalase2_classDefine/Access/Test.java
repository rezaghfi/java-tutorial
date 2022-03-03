package jalase2_classDefine.Access;

import jalase2_classDefine.Access.package1.Access2;

public class Test {
  public static void main(String[] args) {
    //////////////////////////////// Access /////////////////////////////
    Access access = new Access();
    access.publicProperty = 11;
    access.nonAccessProperty = 3;
    access.protectedProperty = 10;

    // another package
    Access2 access2 = new Access2();
    access2.publicProperty = 23;
  }
}
