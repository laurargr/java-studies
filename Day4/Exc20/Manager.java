package Day4.Exc20;
import Day4.Exc20.Employee;

public class Manager extends Employee {

    public Manager(String name, String title, String address, double salary) {
        super(name, title, address, salary);

    }

    @Override
    public void bonuses() {
        double bonusCalculation = ((12.5 / 100.0) * (this.salary * 12));
        System.out.println("Bonus salary: " + bonusCalculation);
    }

    public void performanceReports(Employee employee, int employeeRate) {
        employee.setEmployeeRate(employeeRate);

        System.out.print("Hello" + employee.name);

        if (employeeRate == 0 || employeeRate == 1) {
            System.out.println("Poor performance");
        }
        if (employeeRate == 2 || employeeRate == 3) {
            System.out.println("You doing good, but we have some points to discuss, check my calendar so we can have a meeting");
        }

        if (employeeRate == 4 || employeeRate == 5) {
            System.out.println("You a definitely the one in the time we can relay on");
        } else {
            System.out.println("Choose a number between 0 and 5, 0 being poor performance and 5 being top performance");
        }
    }
    public void managingProjects() {
        System.out.println("find the top performance and make him work for you");
    }
}
