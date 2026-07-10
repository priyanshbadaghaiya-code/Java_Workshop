class StudentResultDetails {
    private String studentName;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setEnglishMarks(double englishMarks) {
        this.englishMarks = englishMarks;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public double getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double getAverage() {
        return getTotalMarks() / 3;
    }

    public String getGrade() {
        double average = getAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class StudentResult {
    public static void main(String[] args) {
    	StudentResultDetails sr = new StudentResultDetails();

        sr.setStudentName("Aniket Pandey");
        sr.setMathMarks(85);
        sr.setScienceMarks(78);
        sr.setEnglishMarks(92);

        System.out.println("Student Name: " + sr.getStudentName());
        System.out.println("Total Marks: " + sr.getTotalMarks());
        System.out.println("Average: " + sr.getAverage());
        System.out.println("Grade: " + sr.getGrade());
    }
}