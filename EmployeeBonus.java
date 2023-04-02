import java.util.Scanner;

 class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, bonus, total;
        char grade;

        System.out.print("Enter the grade of the employee: ");
        grade = sc.nextLine().charAt(0);

        System.out.print("Enter the employee salary: ");
        salary = sc.nextDouble();

        if (salary < 10000) {
            bonus = salary * 0.02;
        } else {
            if (grade == 'A') {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.1;
            }
        }

        total = salary + bonus;

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + total);
    }
}