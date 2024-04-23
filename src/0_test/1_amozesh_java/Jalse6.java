package androidCourse;

public class Jalse6 {

    // atribute
    public static int num;

    // method
    public static void a(int a) {
        System.out.println(a + " and  a is static methed");
    }

    public void b() {
        System.out.println("b is method");
    }

    public int[] passed(int input) {
        int maghA1 = input / 365;
        int bagh1 = input % 365;
        int year = 2023 + maghA1;

        int maghA2 = bagh1 / 30;
        int month = 1 + maghA2;

        int bagh2 = bagh1 % 30;
        int day = 1 + bagh2;

        int[] array = {year, month, day};
        return array;
    }

    public int[] prime(int input) {
        boolean neshan;
        int[] arr = new int[input];
        int index = 0;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                // maghsom allay
                neshan = false;
                if(i == 2){
                    arr[index] = 2;
                    index++;
                }
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        neshan =true;
                        break;
                    }
                }
                if(neshan == false){
                    arr[index] = i;
                    index++;
                }
            }
        }
        return arr;
    }

    public int hoghogh(int hour){
        // 160 * 100
        // 40 * 50
        if(hour <= 160){
            return hour * 100000;
        }else{
            int azafe = hour - 160;
            if(hour > 200){
                azafe = 40;
            }
            return ((160*100000)+(azafe*50000));
        }
    }

    public String[][] sameWords(String[] words){
        for(int i=0; i<words.length; i++){

        }
        return null;
    }
}


