<<<<<<< HEAD
package SOLID;
public class Company extends Product {

    @Override
    void showDetails(LaptopType type){
        if(type.str.equals("Dell")){
            price = 50000;
            name = "Dell Laptop";
        }
        else if(type.str.equals("Hp")){
            price = 40000;
            name = "HP Laptop";
        }
        laptopAccessories(type);
        display();
    }

    @Override
    void laptopAccessories(LaptopType a){
        if(a.str.equals("Hp")){
            System.out.println("providing the bag with Hp laptop");
        }else{
            System.out.println("not providing any accessory");
        }
    }

    void display(){
        System.out.println(name + " of price " + price);
    }
=======
public abstract class Company extends Packing{
     public abstract String laptopName();
      public abstract int price();
>>>>>>> 78bea6ae2a809fe036a9d13cba90510c46ad024b
}