package SOLID;
public class User{
    public static void main(String[] args) {
        LaptopType myLapType = new LaptopType();
        myLapType.typeOfLaptop("Dell");

        Company myLap = new Company();
        myLap.showDetails(myLapType);
    }
}