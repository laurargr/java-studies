package Day4.Exc20;
import Day4.Exc20.Employee;

public class Programmer extends Employee{
    public Programmer(String name, String title, String address, double salary) {
        super(name, title, address, salary);

    }

    @Override
    public void bonuses() {
        double bonusCalculation = ((10.5 / 100.0) * (this.salary * 12));
        System.out.println("Bonus salary: " + bonusCalculation);
    }
}
