package practice1;

public class Sphere {
    private double radius;  // this

    // constructor
    public Sphere(double radius){
        this.radius = radius;
    }
    // setter for radius
    public void setter(double radius){
        this.radius = radius;
    }

    // getter for radius
    public double getter(double radius){
        return radius;
    }

    // area of shere
    public double area(){
        double temp = 4 * Math.PI * (radius * radius);
        return temp;
    }

    // volume of shere
    public double volume(){
        double temp = 4/3 * Math.PI * (radius*radius*radius);
        return temp;
    }

    public String toString(){
        String str = "it is Sphere instance with radius="+this.radius+" and area= "+area()+" and volume= "+volume();
        return str;
    }

}


