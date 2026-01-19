
 //Represents a student with basic academic information.

public class Student {

    private int id;
    private String name;
    private double cgpa;

    
     //Creates a new Student object.
     
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    
     //Displays student information in a readable format.
     
    public void displayInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + cgpa);
    }

    
     // Returns student information as a string. Useful for debugging and logging.
    
    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa + '}';
    }
}
