package SOLID;
public abstract class Product {
     int price;
    String name;
    abstract void laptopAccessories(LaptopType accessory);
    abstract void showDetails(LaptopType comp);
    abstract void display();
}