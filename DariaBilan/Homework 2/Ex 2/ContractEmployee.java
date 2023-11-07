package hw_second.second_ex;

public class ContractEmployee extends Employee implements CalculatePay  {

    final static double SALARY = 2000;
    private String federalTaxIdmember;
    public ContractEmployee(String employeeId, String name, String federalTaxIdmember){
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        averageMonth();

    }

//    @Override
//    public String toString() {
//        return "Contract Employee\nEmployee id: " + super.getEmployeeId() +
//                ",\nEmployee salary per hourly: " + this.calculatePay() +
//                ",\n Average salary for month: " + getAverageMonth() +
//                ",\nFederal tax id:" + this.federalTaxIdmember;
//    }
    public void averageMonth(){
        super.setAverageMonth(SALARY);
    }
    @Override
    public double calculatePay() {
        return  CalculatePay.HOURS / this.SALARY;
    }

    public double getSalary() {
        return SALARY;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
}
