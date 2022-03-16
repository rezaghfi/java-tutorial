package 2_class.Access;

public class Access {
  // puublic
  public int publicProperty;
  //nonAccess = public Access just in current package.
  int nonAccessProperty;
  // protected
  protected int protectedProperty;
  // private
  private int privateProperty;

  public void a(){
    this.privateProperty = 12;
  }
}
