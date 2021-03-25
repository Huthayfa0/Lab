import java.util.ArrayList;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Car("f","a",new Date(),true));
        vehicles.add(new Car("f","a",new Date(),"private"));
        vehicles.add(new Vehicle("f","a",new Date()));
        vehicles.add(new Vehicle());
        for (int i=0;i<vehicles.size();i++)
            System.out.println(vehicles.get(i));

    }
    public static class Vehicle{
        private String name;
        private String plateNumber;
        private Date manufactureDate;

        public Vehicle() {
            this("Mercides","111fff",new Date());
        }

        public Vehicle(String name, String plateNumber, Date manufactureDate) {
            setName(name);
            setPlateNumber(plateNumber);
            setManufactureDate(manufactureDate);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
        }

        public Date getManufactureDate() {
            return manufactureDate;
        }

        public void setManufactureDate(Date manufactureDate) {
            this.manufactureDate = manufactureDate;
        }

        @Override
        public String toString() {
            return "Name= " + getName() +
                    ", PlateNumber= " + getPlateNumber() +
                    ", ManufactureDate= " + getManufactureDate() ;
                     }
    }
    public static class Car extends Vehicle{
        //enum is better but I am afraid to add it because it wasn't given in the course
        private boolean carPrivate;

        public Car() {
        }

        public Car(String name, String plateNumber, Date manufactureDate, boolean carPrivatise) {
            super(name, plateNumber, manufactureDate);
            setCarPrivate(carPrivatise);
        }
        public Car(String name, String plateNumber, Date manufactureDate, String carPrivatise) {
            super(name, plateNumber, manufactureDate);
            if(carPrivatise.equalsIgnoreCase("private"))
                setCarPrivate(true);
        }

        public boolean isCarPrivate() {
            return carPrivate;
        }

        public void setCarPrivate(boolean carPrivate) {
            this.carPrivate = carPrivate;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", car is " + (carPrivate?"private":"public");
                   }
    }
}

