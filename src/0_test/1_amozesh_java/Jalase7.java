package androidCourse;

import java.util.Scanner;

public class Jalase7 {
    public static void main(String[] args) {
        Jalase7.mashrot();
    }

    public static void j7() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int m = 1;
        for (int i = 1; i <= n; i++) {
            m = m * i;
        }
        System.out.println(m);
    }

    public static void mashrot() {
        int[] avg = {12, 17, 11, 10, 3, 5, 14, 15, 20, 1, 2, 4, 1, 6, 18, 14, 13, 12};
        int[] mashrot = new int[avg.length];
        int index = 0;
        for (int i = 0; i < avg.length; i++) {
            if (avg[i] < 12) {
                mashrot[index] = avg[i];
                index++;
            }
        }
        int max =mashrot[0];
        for (int i=1;i<mashrot.length;i++){
            if(mashrot[i] > max) max = mashrot[i];
        }
        System.out.println("max of mashroti is :" + max);
    }
}
