import java.util.Scanner;

class Employee {

    // Calculate annual salary
    public double calculateAnnualSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    // Calculate tax
    public double calculateTax(double annualSalary) {

        double tax = 0;

        if (annualSalary <= 400000) {
            tax = 0;
        }
        else if (annualSalary <= 800000) {
            tax = (annualSalary - 400000) * 0.05;
        }
        else if (annualSalary <= 1200000) {
            tax = (400000 * 0.05)
                + (annualSalary - 800000) * 0.10;
        }
        else {
            tax = (400000 * 0.05)
                + (400000 * 0.10)
                + (annualSalary - 1200000) * 0.15;
        }

        return tax;
    }

    // Calculate salary after tax
    public double calculateSalaryAfterTax(
            double annualSalary, double tax) {

        return annualSalary - tax;
    }

    public static void main(String args[]) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create Employee object
        Employee emp = new Employee();

        // Take input from user
        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = sc.nextDouble();

        // Calculate annual salary
        double annualSalary = emp.calculateAnnualSalary(monthlySalary);

        // Calculate tax
        double tax =  emp.calculateTax(annualSalary);

               
        // Calculate salary after tax
        double salaryAfterTax =  emp.calculateSalaryAfterTax(annualSalary, tax);
                

        // Display result
        System.out.println("\n----- Salary Details -----");

        System.out.println("Monthly Salary   : ₹" + monthlySalary);
        System.out.println("Annual Salary    : ₹" + annualSalary);
        System.out.println("Total Tax        : ₹" + tax);
        System.out.println("Salary After Tax : ₹" + salaryAfterTax);

        sc.close();
    }
}