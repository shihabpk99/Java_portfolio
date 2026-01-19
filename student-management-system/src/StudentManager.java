import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Handles all student-related operations such as
 * add, display, search, remove, and file persistence.
 */
public class StudentManager {

    // Stores all students in memory
    private ArrayList<Student> students = new ArrayList<>();

    // File used for saving and loading student data
    private static final String FILE_NAME = "students.txt";

    /**
     * Constructor loads existing student data from file
     * when the application starts.
     */
    public StudentManager() {
        loadFromFile();
    }

    
     //Adds a new student and saves data to file.
     
    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
        System.out.println("Student added successfully.\n");
    }

    
     //Displays all students stored in the system.
     
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.displayInfo();
            System.out.println("------");
        }
    }

    
     //Saves all student data to a text file.
     
    private void saveToFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Student s : students) {
                writer.write(
                        s.getId() + "," +
                        s.getName() + "," +
                        s.getCgpa() + "\n"
                );
            }
        } catch (IOException e) {
            System.out.println("Error saving student data to file.");
        }
    }

    
     //Loads student data from file into memory.
     
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double cgpa = Double.parseDouble(data[2]);

                students.add(new Student(id, name, cgpa));
            }
        } catch (Exception e) {
            System.out.println("Error loading student data.");
        }
    }

    
      //Searches for a student by ID.

    public void searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found:");
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    
      //Removes a student by ID and updates the file.
     
    public void removeStudentById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                saveToFile();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
