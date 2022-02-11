package jalase2_classDefine;

public class Main {
    public static void main(String[] args) {
        int x=12,y=12,z=12,f=12;
        Vazir naft = new Vazir();
        Vazir omor = new Vazir();
        naft.antekhabeMoaven();
        omor.antekhabeMonshi();
        naft.sum(12,23);
        naft.sum(12,12,12);
        naft.sum(12.3,12.3);
        int result = naft.sum(x,y,z,f);
        System.out.println("summation of "+x+" + "+y+" + "+z+" + "+f+" = "+result);

    }
}
