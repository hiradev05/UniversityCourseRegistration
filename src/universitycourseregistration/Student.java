package universitycourseregistration;
public class Student {
     String studentID;
    String studentName;
     String department;
    public Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public void displayStudentInfo() {
        System.out.println("--- Student Information ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }
}