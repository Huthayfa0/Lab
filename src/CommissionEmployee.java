public class CommissionEmployee extends Employee {//written By Huthayfa Mutan
    protected double rate;
    protected double grossSales;
    public CommissionEmployee(String firstName, String lastName, int ID,double rate,double grossSales) {
        super(firstName, lastName, ID);
        this.rate = rate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getRate() {
        return rate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "rate=" + rate +
                ", grossSales=" + grossSales +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public double earning() {
        return rate*grossSales;
    }
}
