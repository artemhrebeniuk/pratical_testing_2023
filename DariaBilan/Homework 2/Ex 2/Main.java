package hw_second.second_ex;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ContractEmployee contractEmployee1 = new ContractEmployee("1", "Ivan",   "1432");
        ContractEmployee contractEmployee2 = new ContractEmployee("3", "John",  "13432");

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("2", "Sarah", 3000, "92452", 42);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("4", "Rada",  2540.34, "924552", 50);

        //Using Collections
        List<Employee> employees = new ArrayList<>();
        employees.add(contractEmployee1);
        employees.add(salariedEmployee1);
        employees.add(contractEmployee2);
        employees.add(salariedEmployee2);

        Collections.sort(employees);

        //Using class array
        /*
        Employee employee[] = new Employee[]{};
        for(int i = 0; i < employee.length; i++){
            Employee temp;
            if(i > 0 && i <= employee.length) {
                if (employee[i - 1].getAverageMonth() > employee[i].getAverageMonth()) {
                    temp = employee[i - 1];
                    employee[i - 1] = employee[i];
                    employee[i] = temp;
                }
            }
        }*/
        for (Employee e : employees)
            System.out.println(e);
    }
}
