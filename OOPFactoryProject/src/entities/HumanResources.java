package entities;

public class HumanResources {

    public void paySalary(Employee e){

        double salary = e.calculateSalary();
        System.out.println("Paying "+ e.getName() + " salary " + salary);
    }
}
