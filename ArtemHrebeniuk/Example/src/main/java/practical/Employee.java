package practical;

import java.text.DecimalFormat;

public class Employee {
    private static final int BONUS_DIVISOR = 10;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    private String name;
    private float rate = 0.0f;
    private float hours = 0.0f;
    private static float totalSum = 0.0f;

    public Employee() {}

    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, float rate, float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        updateTotalSum();
    }

    private float getSalary() {
        return rate * hours;
    }

    private float getBonuses() {
        return getSalary() / BONUS_DIVISOR;
    }

    @Override
    public String toString() {
        String salaryStr = DECIMAL_FORMAT.format(getSalary());
        String bonusStr = DECIMAL_FORMAT.format(getBonuses());
        return "Information about employee:\nName - " + name + "\nRate - " +
                rate + "\nHours - " + hours + "\nSalary - " + salaryStr + "\nBonuses - "
                + bonusStr + "\nTotal salary of all workers: " + totalSum + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        totalSum -= getSalary() + getBonuses();
        this.rate = rate;
        updateTotalSum();
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        totalSum -= getSalary() + getBonuses();
        this.hours = hours;
        updateTotalSum();
    }

    private void updateTotalSum() {
        totalSum += getSalary() + getBonuses();
    }
}

