package jalase2_classDefine;

public class Vazir {
    public String fistName;
    public String lastName;
    public int age;
    public void antekhabeMoaven() {
        System.out.println("ana antekhabeMoaven");
    }

    public void antekhabeMonshi() {
        System.out.println("ana antekhabeMonshi");
    }

    // overloaded Methods
    public void sum(int x, int y){
        System.out.println("summation of "+x+" + "+y+" = "+(x+y));
    }
    public void sum(double x, double y){
        System.out.println("summation of "+x+" + "+y+" = "+(x+y));
    }
    public void sum(int x, int y, int z){
        System.out.println("summation of "+x+" + "+y+" + "+z+" = "+(x+y+z));
    }
    public int sum(int x, int y, int z, int f){
        return x+y+z+f;
    }

}
