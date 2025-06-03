package JavaDocs;

/**
 * This class performs basic math operations.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.print("Sum is: " + add(4, 6));
    }

    /**
     * Adds two integers.
     *
     * @param a First number i.e a
     * @param b Second number i.e b
     * @return The sum of a and b
     * @author Khubaib Husain
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
