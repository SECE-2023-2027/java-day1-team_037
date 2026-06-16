import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Input a Decimal Number: ");
        int decimal = sc.nextInt();

        // Conversion
        String octal = Integer.toOctalString(decimal);

        // Output
        System.out.println("Octal number is: " + octal);

        sc.close(); // good practice
    }
}
