import java.util.Scanner;  // Imports the Scanner class for user input

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  // Scanner for user input

        // Ask for and print details to console
        System.out.println("Enter First Name: ");
        String firstName = scnr.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scnr.nextLine();

        System.out.println("Enter Address: ");
        String address = scnr.nextLine();

        System.out.println("Enter City: ");
        String city = scnr.nextLine();

        System.out.println("Enter Zip Code: ");
        String zipCode = scnr.nextLine();

        // Print entered information to console
        System.out.println("\nHere is the information you entered:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}
