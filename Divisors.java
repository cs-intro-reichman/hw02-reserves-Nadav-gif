/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
   public static void main(String[] var0) {
      int var1 = Integer.parseInt(var0[0]);
      for(int var2 = 1; var2 <= var1; ++var2) {
         if (var1 % var2 == 0) {
            System.out.println(var2);
         }
      }
   }
}
