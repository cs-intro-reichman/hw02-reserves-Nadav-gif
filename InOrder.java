/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.Random;

public class InOrder {
    public static void main(String[] args) {
        Random r1 = new Random();
        int rand_int1 = r1.nextInt(0,10);
        System.out.print(rand_int1 + " ");
        int rand_int2 = r1.nextInt(0,10);
        while (rand_int2 >= rand_int1) {
            System.out.print(rand_int2 + " ");
            rand_int1 = rand_int2;
            rand_int2 = r1.nextInt(0,10);
        }
    }
}
