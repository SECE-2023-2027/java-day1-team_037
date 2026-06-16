
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();

        // Conversion
        String hex = Integer.toHexString(decimal).toUpperCase();

        // Output
        System.out.println("Hexadecimal number is : " + hex);
    }
}


