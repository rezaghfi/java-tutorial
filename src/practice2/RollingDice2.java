package practice2;

public class RollingDice2 {
    public static void main(String[] args) {
        PairOfDice p1 = new PairOfDice();
        System.out.println("roll of PairOfDice= " + p1.roll());
        p1.setterOfDie1(12);
        p1.setterOfDie2(11);
        System.out.println("sum of the two die values is "+p1.toString());
    }
}

