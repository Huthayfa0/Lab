import java.util.Arrays;

public class Employee implements Comparable {
//written By Huthayfa Mutan
    protected String firstName;
    protected String lastName;
    protected int ID;
    public Employee(String firstName,String lastName,int ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID=ID;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double earning(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }
    public static double totalEarning(Employee[] a){
      double sum=0;
      for (Employee i:a){
          sum+=i.earning();
      }
      return sum;
    }

    @Override
    public int compareTo(Object o) {
        return new Double(this.earning())//inboxing to use class Double
                .compareTo//this method will compare between the two doubles
                // with returning 1 if bigger or 0 if smaller or -1 otherwise
                        (((Employee)o).earning());//casting o to Employee
    }
}
