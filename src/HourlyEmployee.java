public class HourlyEmployee extends Employee {//written By Huthayfa Mutan
    private double wage;
    private int numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, int ID, double wage, int numberOfHoursWorked) {
        super(firstName, lastName, ID);
        this.wage = wage;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double earning() {
        return wage*numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
