
public class User{
    public static void main(String[] args) {
        BuyDellLaptop myDell = new BuyDellLaptop();
        LaptopSpecification myDellSpec = myDell.buyLaptop();
        myDellSpec.display();

        BuyHpLaptop myHp = new BuyHpLaptop();
         LaptopSpecification myHpSpec = myHp.buyLaptop();
        myHpSpec.display();
    }
}