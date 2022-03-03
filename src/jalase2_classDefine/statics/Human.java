package jalase2_classDefine.statics;

public class Human {

    public static int staticProperty = 10;
    public int nonStaticProperty = 11;

    public static void staticMethod(){
        System.out.println("ana static method and call me with class name");
    }

    public void nonStaticMethod(){
        System.out.println("ana non static method and class it with instance name");
    }

    static class Inner{
        public void InnerClassMethod(){
            System.out.println("ana inner class method and i can just call static method and property in outter class");
            staticProperty = 14;
            staticMethod();
        }
    }
}
