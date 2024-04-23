package practice1;

public class MultiSphere {
    public static void main(String[] args){
        Sphere s1 =new Sphere(2.3);
        Sphere s2 = new Sphere(2.7);
        Sphere s3 = new Sphere(3.1);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        s1.setter(3.3);
        System.out.println(s1.toString());
    }
}
