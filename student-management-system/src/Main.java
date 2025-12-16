public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Shihab", 3.0);
        s1.displayInfo();

        StudentManager manager = new StudentManager();
        manager.addStudent(s1);
    }
    
}
