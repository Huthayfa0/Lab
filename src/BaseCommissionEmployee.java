public class BaseCommissionEmployee extends CommissionEmployee {//written By Huthayfa Mutan
    protected double baseSalary;

    public BaseCommissionEmployee(String firstName, String lastName, int ID, double rate, double grossSales,double baseSalary) {
        super(firstName, lastName, ID, rate, grossSales);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earning() {
        return super.earning()+baseSalary;
    }

    @Override
    public String toString() {
        return "BaseCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", rate=" + rate +
                ", grossSales=" + grossSales +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
