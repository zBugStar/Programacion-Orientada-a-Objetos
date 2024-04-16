package edu.caldas.poo.employed;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EmployedTest {
    public static void main(String[] args) {
        Map<String, Employed> employedMap = new HashMap<>();

        Employed employed1 = new Employed("Antioquia", "Jorge", 4000000);
        Employed employed2 = new Employed("Caldas", "Julian", 10000000);

        employedMap.put("employed1", employed1);
        employedMap.put("employed2", employed2);


        for (String employeeName : employedMap.keySet()) {
            Employed employed = employedMap.get(employeeName);
            double salary = employed.getSalary();
            double salaryA = employed.methodSalaryA(salary);

            DecimalFormat formatter = new DecimalFormat("#,###.##");
            String salaryFormattedA = formatter.format(salaryA);
            String salaryFormattedM = formatter.format(salary);

            String responseName = "Su nombre es " + employed.getNameEmployed();
            String responseDepartment = "Vive en el departamento de " + employed.getDepartment();
            String responseSalary = "Su salario mensual es " + "$ " + salaryFormattedM + " de pesos";
            String responseSalaryA = "y su salario anual es de " + "$ " + salaryFormattedA + " pesos";
            String responseID = "y su ID de registro es " + employed.getID();

            System.out.println(responseName + " " + responseID);
            System.out.println(responseDepartment);
            System.out.println(responseSalary + " " + responseSalaryA);
            System.out.println();
        }
    }
}
