package Day4.Exc20;

public abstract class Employee {
    
    protected String name;
    protected String title;
    protected String address;
    protected double salary;
    protected int employeeRate;
    
    public Employee (String name, String title, String address, double salary) {
        this.name = name;
        this.title = title;
        this.address = address;
        this.salary = salary;
    }

    public abstract void bonuses ();
    public void setEmployeeRate(int employeeRate) {
        this.employeeRate = employeeRate;
    }
    public int getEmployeeRate(){
        return employeeRate;
    }

}
