class Student {
    // Private data members
    private int rollNo;
    private String name;
    private double marks;
    // Public setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    // Public getter methods
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
}

public class Practical11{
    public static void main(String[] args) {

        // Creating object
        Student s = new Student();

        // Setting values using setter methods
        s.setRollNo(101);
        s.setName("Rahul");
        s.setMarks(85.5);

        // Getting values using getter methods
        System.out.println("Student Details");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
