package practice3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.printf("area of triangle1= %.3f %n", triangle1.area());
        Triangle triangle2 = new Triangle();
        Scanner input = new Scanner(System.in);
        System.out.println("enter base of triangle2 between 10 t0 20:");
        triangle2.h = input.nextDouble();
        System.out.println("enter height of triangle2 between 10 t0 20");
        triangle2.b = input.nextDouble();
        if (10 <= triangle2.b && triangle2.b <= 20 && 10 <= triangle2.h && triangle2.h <= 20) {
            System.out.printf("area of triangle2= %.3f %n", triangle2.area());
            int ratio = (int)(triangle1.area() * 100 / triangle2.area());
            System.out.println("ratio of the area of the triangle1 to triangle2= " + ratio);
        } else {
            System.out.println("your base or height is wrong");
        }
    }
}
