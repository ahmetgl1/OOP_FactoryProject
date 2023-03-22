package entities;

public class Manager extends Employee{

protected String department;
public static final Double MANAGEMENT_PAYMENT = 10_000.0;

    public Manager() {
    }

    public Manager(Integer no, String name, Integer year, String department) {
        super(no, name, year);
        this.department = department;
    }

    public void manage(){
        System.out.println(getName() + " is managing !");
    }

    @Override
    public double calculateSalary() {

        this.salary = MANAGEMENT_PAYMENT + super.calculateSalary();
        return salary;

    }

    @Override
    public void work() {
        System.out.println( getName() + "is working");
    }

    @Override
    public void toPrint() {
        super.toPrint();
        System.out.println("Department: " + department);
    }
}
