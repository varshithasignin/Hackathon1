import java.util.Scanner;

class Student {
    String studentName, rollNumber, courseName;
    double marks;
    int courseCredits;
    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    public double calculateFee() {
        return courseCredits * 1500.0;
    }
    public boolean checkEligibility() {
        return marks >= 50.0;
    }
    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85.0) return fee * 0.20;
        if (marks >= 70.0) return fee * 0.10;
        return 0.0;
    }
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }
    public void displayDetails() {
        System.out.println("\nName: " + studentName + "\nRoll No: " + rollNumber);
        System.out.println("Marks: " + marks + "\nCourse: " + courseName + " (" + courseCredits + " credits)");
        System.out.println("Status: Eligible");
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Credits: ");
        int credits = sc.nextInt();
        Student st = new Student(name, roll, marks, course, credits);
        if (st.checkEligibility()) {
            st.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration (Marks < 50).");
        }
      sc.close();
    }
}