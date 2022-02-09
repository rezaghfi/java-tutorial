package jalase1_helloJava;

public class Sample {
    Sample(){
        System.out.println("ana constructor with no parameter");
    }
    Sample(int a){
        System.out.println("ana constroctor with parameter. a ="+ a);
    }

    public void javaVariable(){
        char a = 'a',  b = 'b';
        int c = 1;
        short d = 1;
        long e = 1232323232;
        float f = 1.34f;
        double g = 232343.34343;
        byte h = 1;
        //Double i = new Double(123232.3434);

        System.out.println("a , b are character and they values are: " + a + ", "+b);
    }
}
