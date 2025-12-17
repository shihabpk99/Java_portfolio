import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do{
            System.out.println("\n-- Student Management System --");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            if(choice == 1){
                System.err.println();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter CGPA: ");
                double cgpa = scanner.nextDouble();
                
                Student student = new Student(id, name, cgpa);
                manager.addStudent(student);
            }
        else if(choice == 2){
            manager.displayAllStudents();
        }else if(choice == 3){
            System.out.println("Exiting system. Goodbye!");
        }else{
            System.out.println("Invalid choice. Please try again.");
        }
    } while(choice != 3);
        scanner.close();
    }
}
