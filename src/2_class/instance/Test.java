package 2_class.instance;

public class Test {
    public static void main(String[] args) {
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
        System.out.println("vazir naft fist and last Name are: " + naft.firstName + " " + naft.lastName);
        System.out.println("vazir kar fist and last Name are: " + kar.firstName + " " + kar.lastName);
        System.out.println("Vazir's Country Name is= " + Vazir.countryName + "\nVazir naft country Name is = " + naft.countryName);
        Vazir.dolat = "Raisi";
        omor.countryName = "iraq";
        System.out.println("Vazir's Country Name is= " + Vazir.countryName + "\nVazir naft country Name is = " + naft.countryName);
        Vazir.staticFunc();

    }
}
