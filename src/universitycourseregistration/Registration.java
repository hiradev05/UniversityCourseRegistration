package universitycourseregistration;
public class Registration {
    Student student;
    Course course;
    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
    public void displayRegistration() {
        System.out.println("===== Registration Details =====");
        student.displayStudentInfo();
        System.out.println();
        course.displayCourse();
    }
}
