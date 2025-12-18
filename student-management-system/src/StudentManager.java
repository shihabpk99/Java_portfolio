import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentManager(){
        loadFromFile();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
        System.out.println("Student added successfully.\n");
    }

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

    private void saveToFile(){
        try(FileWriter writer = new FileWriter(FILE_NAME)){
            for(Student s : students){
               writer.write(
                s.getId()+","+
                s.getName()+","+
                s.getCgpa()+"\n"
               );
            }
        }catch (IOException e){
            System.out.println("Error saving to Data. ");
        }
    }

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
            System.out.println("Error loading data.");
        }
    }

}
