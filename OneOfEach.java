
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.Random;

public class OneOfEach {
    public static void main(String[] args) {
        Random r1 = new Random();
        int boy = 0;
        int girl = 1;
        boolean have_boy = false;
        boolean have_girl = false;
        int count = 0;
        while (have_boy == false || have_girl == false) {
            count++;
            int rand = r1.nextInt(0,2);
            if (rand == boy) {
                System.out.print("b ");
                have_boy = true;
            }
            else {
                System.out.print("g ");
                have_girl = true;
            }
        }
        System.out.println();
        System.out.println("You made it... and you now have " + count + " children.");
    }
}
