public class SalariedEmployee extends Employee{//written By Huthayfa Mutan
    private double weeklysalary;

    public SalariedEmployee(String firstName, String lastName, int ID,double weeklysalary) {
        super(firstName, lastName, ID);
        setWeeklysalary(weeklysalary);
    }

    public double getWeeklysalary() {
        return weeklysalary;
    }

    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }

    @Override
    public double earning() {
        return weeklysalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklysalary=" + weeklysalary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
