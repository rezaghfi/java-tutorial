package practice2;

public class PairOfDice {
    private Die d1;
    private Die d2;

    private final int MAX = 6;

    public PairOfDice(){
        d1 = new Die();
        d2 = new Die();
    }

    public void setterOfDie1(int faceValue1){
        d1.setFaceValue(faceValue1);
    }

    public void setterOfDie2(int faceValue2){
        d2.setFaceValue(faceValue2);
    }

    public int getterOfDie1(){
        return d1.getFaceValue();
    }

    public int getterOfDie2(){
        return d2.getFaceValue();
    }

    public int roll(){
        int temp = (int)(Math.random() * MAX) + 1;
        d1.setFaceValue(temp);
        d2.setFaceValue(temp);
        return temp;
    }
    public String toString(){
        int sum = d1.getFaceValue() + d2.getFaceValue();
        String result = Integer.toString(sum);
        return result;
    }

}
