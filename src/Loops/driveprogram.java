package Loops;
import java.util.Scanner;

class drivaprogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks, or 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program ended.");
        scanner.close();
    }
}
