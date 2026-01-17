import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do{
System.out.println("1. Add Student");
System.out.println("2. View All Students");
System.out.println("3. Search Student by ID");
System.out.println("4. Remove Student by ID");
System.out.println("5. Exit");

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

   }
 }
  while (choice != 5);

}
}