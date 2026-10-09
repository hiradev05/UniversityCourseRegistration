package universitycourseregistration;
public class Course {
    String coursecode;
    String coursetitle;
    int credithrs;

    public Course(String coursecode, String coursetitle, int credithrs) {
        this.coursecode=coursecode;
        this.coursetitle=coursetitle;
        this.credithrs=credithrs;
    }
    public void displaycourse(){
        System.out.println("Course name : "+coursetitle);
        System.out.println("Course code : "+coursecode);
        System.out.println("Course credit hours : "+credithrs);
    }
}
