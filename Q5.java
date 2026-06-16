import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Input a Decimal Number : ");
        int decimal = sc.nextInt();

        // Conversion
        String binary = Integer.toBinaryString(decimal);

        // Output
        System.out.println("Binary number is: " + binary);
    }
}


