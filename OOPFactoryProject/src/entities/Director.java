package entities;

public class Director extends Manager{

    private int bonus;

    public Director() {
    }

    public Director(Integer no, String name, Integer year, String department, int bonus) {
        super(no, name, year, department);
        this.bonus = bonus;
    }

    public void makeAStrategicPlan(){
        System.out.println(getName() +" Director is a strategic plan");
    }

    @Override
    public double calculateSalary() {

        this.salary = super.calculateSalary() + bonus;

        return salary;
    }


    @Override
    public void toPrint() {
        super.toPrint();
        System.out.println("Bonus: " + bonus);
    }
}
