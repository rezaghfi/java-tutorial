package j2_class_define.Access.package1;

public class Access3 extends Access2{

  public void a(){
    Access2 access2 = new Access2();
    access2.protectedProperty = 12;
    access2.publicProperty = 23;
    access2.nonAccessProperty = 23;
  }
}
