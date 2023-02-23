package j2_class_define.instance;

public class Car {

    // attribute
    String color;
    int width;
    int length;
    String model;
    String companyName;


    // constructor
    public Car(String color, int width, int length, String model, String companyName){
        this.color = color;
        this.width = width;
        this.length = length;
        this.model = model;
        this.companyName = companyName;
    }
    //method
    void start(){

        System.out.println(this.model+" is starting");
    }

    void acceleration(){
        System.out.println("car is moving");
    }

    void stop(){
        System.out.println("car is stoping");
    }
}
