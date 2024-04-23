package practice3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Triangle {
    public double h; // height
    public double b; // base

    public Triangle(){
        Random r = new Random();
        this.h = 5 + (5) * r.nextDouble();
        this.b = 5 + (5) * r.nextDouble();
    }

    public double area(){
        return (b * h)/2;
    }

}
