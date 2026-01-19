import java.util.Scanner;

/**
 * Entry point of the Student Management System application.
 * Handles user interaction and menu navigation.
 */
public class Main {

    public static void main(String[] args) {

        // Manages all student-related operations
        StudentManager manager = new StudentManager();

        // Used to take user input from console
        Scanner scanner = new Scanner(System.in);

        int choice;

        // Menu loop continues until user chooses Exit
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter CGPA: ");
                double cgpa = scanner.nextDouble();

                // Create student object and add to manager
                Student student = new Student(id, name, cgpa);
                manager.addStudent(student);

            } else if (choice == 2) {

                // Display all stored students
                manager.displayAllStudents();

            } else if (choice == 3) {

                System.out.print("Enter student ID to search: ");
                int searchId = scanner.nextInt();
                manager.searchStudentById(searchId);

            } else if (choice == 4) {

                System.out.print("Enter student ID to remove: ");
                int removeId = scanner.nextInt();
                manager.removeStudentById(removeId);

            } else if (choice == 5) {

                System.out.println("Exiting system. Goodbye!");

            } else {

                // Handles invalid menu options
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        // Close scanner resource
        scanner.close();
    }
}
