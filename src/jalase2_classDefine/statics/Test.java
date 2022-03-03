package jalase2_classDefine.statics;

public class Test {
    public static void main(String[] args) {
        //////////////////////////////////////// meta space allocation ////////////////////////
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

        ////////////// non static method and property
        Human h = new Human();
        h.nonStaticMethod();
        h.nonStaticProperty = 18;

        ///////////// static method and property
        Human.staticMethod();
        Human.staticProperty = 13;

        /// static inner class
        Human.Inner inner = new Human.Inner();
        inner.InnerClassMethod();

        ////
    }
}
