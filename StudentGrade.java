import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks in Python: ");
        int pythonMarks = sc.nextInt();
        
        System.out.print("Enter the marks in C Programming: ");
        int cProgrammingMarks = sc.nextInt();
        
        System.out.print("Enter the marks in Mathematics: ");
        int mathMarks = sc.nextInt();
        
        System.out.print("Enter the marks in Physics: ");
        int physicsMarks = sc.nextInt();
        
        int totalMarks = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
        double aggregate = totalMarks / 4.0;
        
        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);
        
        String grade = "";
        if (aggregate >= 75) {
            grade = "DISTINCTION";
        } else if (aggregate >= 60) {
            grade = "FIRST DIVISION";
        } else if (aggregate >= 50) {
            grade = "SECOND DIVISION";
        } else if (aggregate >= 40) {
            grade = "THIRD DIVISION";
        } else {
            grade = "FAIL";
        }
        
        System.out.println(grade);
    }

}