<<<<<<< HEAD
package SOLID;
public class User{
    public static void main(String[] args) {
        LaptopType myLapType = new LaptopType();
        myLapType.typeOfLaptop("Dell");

        Company myLap = new Company();
        myLap.showDetails(myLapType);
=======

public class User{
    public static void main(String[] args) {
        BuyDellLaptop myDell = new BuyDellLaptop();
        LaptopSpecification myDellSpec = myDell.buyLaptop();
        myDellSpec.display();

        BuyHpLaptop myHp = new BuyHpLaptop();
         LaptopSpecification myHpSpec = myHp.buyLaptop();
        myHpSpec.display();
>>>>>>> 78bea6ae2a809fe036a9d13cba90510c46ad024b
    }
}