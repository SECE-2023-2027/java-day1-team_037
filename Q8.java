import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Input a binary number: ");
        String binary = sc.nextLine();

        // Conversion
        int decimal = Integer.parseInt(binary, 2);

        // Output
        System.out.println("Decimal Number: " + decimal);

        sc.close(); // good practice
    }
}
