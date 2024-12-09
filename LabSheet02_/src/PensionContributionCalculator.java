import java.util.*;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //constants ariables
        final int SALARY_CEILING = 6000;
        final float EMPLOYEE_RATE_55_AND_BELOW = 0.2f;
        final float EMPLOYER_RATE_55_AND_BELOW = 0.17f;
        final float EMPLOYEE_RATE_55_TO_60 = 0.13f;
        final float EMPLOYER_RATE_55_TO_60 = 0.13f;
        final float EMPLOYEE_RATE_60_TO_65 = 0.075f;
        final float EMPLOYER_RATE_60_TO_65 = 0.09f;
        final float EMPLOYEE_RATE_65_ABOVE = 0.05f;
        final float EMPLOYER_RATE_65_ABOVE = 0.075f;

        //ariables
        int salary, age; // to be input
        int contributableSalary;
        float employeeContribution, employerContribution, totalContribution;

        //Input
        System.out.print("Enter the monthly salary: $");
        salary = scanner.nextInt();   
        System.out.print("Enter the age: ");
        age = scanner.nextInt();
       
        // Check the contribution cap
        contributableSalary = SALARY_CEILING;
        if(salary > contributableSalary){
            salary = contributableSalary;
        }

        // Compute various contributions in "float" using a nested-if to handle 4 cases
        if (age <= 55) { // 55 and below

            //calculate employer and yee Contribution
            employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
        } 
        else if (age <= 60) { // (60, 65]
            employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = salary * EMPLOYER_RATE_55_TO_60;
        } 
        else if (age <= 65) { // (55, 60]
            employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = salary * EMPLOYER_RATE_60_TO_65;
        } 
        else { // above 65
            employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
        }

        //output yer and yee Contribution
        System.out.printf("The employee's contribution is: $%.2f", employeeContribution);
        System.out.printf("\nThe employer's contribution is: $%.2f", employerContribution);

        //calculate total
        totalContribution = employeeContribution + employerContribution;

        //output
        System.out.printf("\nThe total contribution is: $%.2f", totalContribution);

        scanner.close();
    }
}