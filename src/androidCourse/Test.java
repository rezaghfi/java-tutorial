package androidCourse;

public class Test {

    public static void main(String[] args){
        Jalse6 j6 = new Jalse6();
        j6.a(12);
        j6.b();
        Jalse6 j66 = new Jalse6();
        // static
        Jalse6.a(14);
        Jalse6.num = 23;
        //
        int[] a = j6.passed(366);
        System.out.println(a[0]+ "/" + a[1] + "/" + a[2]);
        a = j6.prime(57);
        for (int i: a) {
            System.out.println(i);
        }
        System.out.println(j6.hoghogh(161));
        //
        int[] arr1 = new int[2];
        int[][] arr2 = new int[2][2];
        arr1[0] = 1;
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[1][0] = 3;

        String[] name = {"reza", "hasan", "mohamadreza", "mohammd"};
        String[][] javab = {{"mohammad", "mohamadreza"}, {"reza"}, {"hasan"}};
    }
}
