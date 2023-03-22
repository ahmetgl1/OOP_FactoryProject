import entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        run1();

        run2();

        run3();


    }
    private static void run1(){

        Employee engineer = new Engineer(1,"Işıl",1,"Software Engineer");
        engineer.toPrint();
        System.out.println(engineer.calculateSalary());

        System.out.println("------------------------------");

        Manager manager = new Manager(2,"Ahmet",1,"IT");
        manager.toPrint();
        System.out.println("------------------------------");

        Director director = new Director(3,"Yusuf",1,"Sales",20_000);
        director.toPrint();
        System.out.println("------------------------------");
    }
    private static void run2(){
        Employee e = new Manager(1,"Ahmet",1,"Sales");
        e.toPrint();
        System.out.println(e.calculateSalary());

        System.out.println("------------------------------");

        e =  new Manager(2,"Işıl",1,"IT");
        e.toPrint();
        System.out.println("------------------------------");

       e = new Director(3,"Yusuf",1,"Sales",20_000);
        e.toPrint();
        System.out.println("------------------------------");


    }
    private static void run3(){
        Employee employee = new Engineer(2,"Ahmet",1,"ARGE");
        employee.work();
        employee.toPrint();

        Employee manager = new Manager(3,"Yusuf",1,"Sales");
        manager.work();
        manager.toPrint();

        Employee director = new Director(4,"Ahmet",1,"Sales",20_000);
        director.toPrint();

        HumanResources humanResources = new HumanResources();
        humanResources.paySalary(director);


    }



}