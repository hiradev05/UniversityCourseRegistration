package universitycourseregistration;
public class UniversityCourseRegistration {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Alice Smith", "Computer Science");
        student1.displayStudentInfo();
        Course c1=new Course("ECE-2071","Software Construction",3);
        c1.displayCourse();
    }
}