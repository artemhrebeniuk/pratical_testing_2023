package hw_second.second_ex;

public class SalariedEmployee extends Employee implements CalculatePay{
    private double salary;
    private String socialSecurityNumber;
    private double workedHours;

    public SalariedEmployee(String employeeId, String name,  double salary, String socialSecurityNumber, double workedHours){
        super(employeeId,name);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.workedHours = workedHours;
        averageMonthly();
    }

    public double averageMonthly(){
        super.setAverageMonth(calculatePay() * workedHours);
        return super.getAverageMonth();
    }

//    @Override
//    public String toString() {
//        return "Salaried Employee\nEmployee id: " + super.getEmployeeId() +
//                ",\nEmployee salary per hour: " + this.calculatePay() +
//                ",\nAverage month salary: " + averageMonthly() +
//                ",\nSocial security number:" + this.socialSecurityNumber;
//    }
    @Override
    public double calculatePay() {
        return this.salary / this.workedHours;
    }

}
