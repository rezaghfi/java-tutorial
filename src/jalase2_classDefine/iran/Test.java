package jalase2_classDefine.iran;

import jalase2_classDefine.Access;

public class Test extends Access {
  public Test() {
    System.out.println("ana test instance in iran ");
    Access access = new Access();
    // access in another package just for public.
    access.publicProperty = 10;
    // access inheretence another package just protected.
    super.protectedProperty = 12;
  }
}
