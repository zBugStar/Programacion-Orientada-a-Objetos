package BasicLearning;
import java.util.Random;

public class rollsDie {
    public static void main(String[] args) {

        int[] rolls = new int[6];
        Random rnd = new Random();

        for (int i = 0; i < 6000; i++) {
            int roll = rnd.nextInt(6) + 1;
            rolls[roll - 1]++;
        }

        System.out.println("Face | Frecuency");

        for(int j = 0; j < rolls.length; j++){
            System.out.println("Face " + (j + 1) + ": " + rolls[j]);
        }
    }
}
