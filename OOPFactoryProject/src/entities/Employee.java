package entities;

public abstract class Employee implements Worker {

    private Integer no;
    private String name;
    private Integer year;
    protected double salary;
    public static final Double BASE_SALARY = 1_000.0;

    public Employee() {
    }


    public Employee(Integer no, String name, Integer year) {
        this.no = no;
        this.name = name;
        this.year = year;

    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public double calculateSalary(){
        this.salary = year * BASE_SALARY;
         return salary;


    }



    public void toPrint() {
        System.out.println("no :" + no);
        System.out.println("name :" + name);
        System.out.println("year :" + year);
        calculateSalary();
        System.out.println("salary :" + this.salary);

    }

}
