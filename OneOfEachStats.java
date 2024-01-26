import java.util.Random;

public class OneOfEachStats1 {
    public static void main(String[] args) {

        int times = Integer.parseInt(args[0]);
        double avg = 0;
        double countall = 0.0; // all the children
        int count_this = 0; // the children in a specific family
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        // boy will be 0 girl will be 1
        for (int i=0; i<times; i++) {  
            Random r1 = new Random();
            boolean have_boy = false;
            boolean have_girl = false;
            while (have_boy == false || have_girl == false) {
                countall++;
                count_this++;
                int rand = r1.nextInt(0,2);
                if (rand == 0) {
                    have_boy = true;
                }
                else {
                    have_girl = true;
                }
            }
            have_boy = false;
            have_girl = false;
            if (count_this == 2) {
                    num_2++;
                } else if (count_this == 3) {
                    num_3++;
                }
                else {
                    num_4++;
                }
            count_this = 0;
        }
        avg = countall/times;
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + num_2);
        System.out.println("Number of families with 3 children: " + num_3);
        System.out.println("Number of families with 4 or more children: " + num_4);
        if (num_2 >= num_3 && num_2 >= num_4) {
            System.out.println("The most common number of children is 2.");
        }
        else if (num_3 >= num_2 && num_3 >= num_4) {
            System.out.println("The most common number of children is 3.");
        }
        else {
            System.out.println("The most common number of children is 4 or more.");

        }
    }
}
