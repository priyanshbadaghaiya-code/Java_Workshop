class StudentDetails{
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

   
    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }
}

public class Qas {
    public static void main(String[] args) {
    	StudentDetails cs = new StudentDetails();

        cs.setStudentName("Priyansh");
        cs.setCourseName("Java Programming");
        cs.setCourseFee(10000);
        cs.setDiscountPercent(20);

        System.out.println("Student Name : " + cs.getStudentName());
        System.out.println("Course Name  : " + cs.getCourseName());
        System.out.println("Final Fee    : " + cs.getFinalFee());
    }
}
