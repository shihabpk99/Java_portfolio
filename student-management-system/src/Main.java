public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Shihab", 3.0);
        Student s2 = new Student(2, "Araf", 3.4);

        manager.addStudent(s1);
        manager.addStudent(s2);

        System.out.println("All Students:");
        manager.displayAllStudents();
    }
}
