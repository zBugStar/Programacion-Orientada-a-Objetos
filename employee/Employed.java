package edu.caldas.poo.employed;
import java.util.Random;

public class Employed {
    private String nameEmployed;
    private double salary;
    private double salaryA;

    private String department;
    private int id;

    public Employed(
            String department ,
            String nameEmployed ,
            double salary
            ){
        this.department = department;
        this.nameEmployed = nameEmployed;
        this.salary = salary;
        this.id = generateRandomID();

    }

    private int generateRandomID() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

    public String getNameEmployed(){
        return nameEmployed;
    }
    public void setNameEmployed(String nameEmployed){
        this.nameEmployed=nameEmployed;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double methodSalaryA(double salary){
        if(salary > 0.0){
            salaryA = salary * 12;
        }
        return  salaryA;

    }

    public int getID() {
        return id;
    }



}
