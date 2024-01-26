/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int var1 = Integer.parseInt(args[0]);
        int sum = 0;
        String s = var1 + " is a perfect number since " + var1;
        for(int var2 = 1; var2 < var1; var2++) {
            if (var1 % var2 == 0) {
                if (var2 == 1) {
                    s += " = " + var2;
                    sum += var2;
                }
                else {
                    s += " + " + var2;
                    sum += var2;
                }
            }
        }
        if (sum == var1) {
            System.out.println(s);
        }
        else {
            System.out.println(var1 + " is not a perfect number");
        }
    }
}
