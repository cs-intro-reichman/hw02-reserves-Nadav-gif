/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        String s = args[0];
        String new_s = "";
        int i = s.length() -1;
        while (i>=0) {
            new_s += s.charAt(i);
            i -= 1;
        }
        System.out.println(new_s);
        System.out.println("The middle character is " + new_s.charAt(new_s.length()/2));
    }
}
