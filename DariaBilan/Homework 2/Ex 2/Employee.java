package hw_second.second_ex;

public class Employee implements Comparable<Employee>{
    private String employeeId;
    private String name;
    private double averageMonth;

    public Employee(String employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }


    public int compareTo(Employee other) {
        return Double.compare(this.averageMonth, other.averageMonth);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", averageMonth=" + averageMonth +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getAverageMonth() {
        return averageMonth;
    }

    public void setAverageMonth(double averageMonth) {
        this.averageMonth = averageMonth;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
