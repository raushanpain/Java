public class Student {
    String name;
    int rollNo;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Jeet";
        s.rollNo = 101;
        s.displayDetails();
    }
}
