
//=========================================== Lab4 ===========================================
public class DemoCar {
    public static void main(String[] args){
        //OBJ
        Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);

        //display
        System.out.println("Company Name: " + car.getCompanyName()
                        + "\nModel Name: " + car.getModelName()
                        + "\nYear: " + car.getYear()
                        + "\nMileage: " + car.getMileage());
        System.out.println();
    
        //Update details
        System.out.println("Updated Car Details:");
        car.setCompanyName("Toyota");
        car.setModelName("Corolla");
        car.setYear(2015);

        System.out.println("Company Name: " + car.getCompanyName()
                        + "\nModel Name: " + car.getModelName()
                        + "\nYear: " + car.getYear());

        //error test
        car.setYear(1885);
        car.setCompanyName(null);
    }
}