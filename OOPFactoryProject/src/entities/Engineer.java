package entities;

public class Engineer extends Employee{

    private String field;
    private static final Double ENGINEERING_PAYMENT = 8_000.0;

    public Engineer() {
    }

    public Engineer(Integer no, String name, Integer year, String field) {
        super(no, name, year);
        this.field = field;
    }

    @Override
    public void work() {
        System.out.println("Engineering " + getName() + "is working on a project");
    }

    @Override
    public double calculateSalary() {

        this.salary = ENGINEERING_PAYMENT + super.calculateSalary();
        return salary;
    }

    @Override
    public void toPrint() {
        super.toPrint();
        System.out.println("Field: " + field);
    }
}
