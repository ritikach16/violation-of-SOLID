import java.util.*;
public class LaptopSpecification implements Specification{
    private List<Packing> laptopsList = new ArrayList<>();

    @Override
    public void add(Packing laptop){
        laptopsList.add(laptop);
    }

    @Override
    public void getCost(){
        for(Packing laptop : laptopsList){
            laptop.price();
        }
    }

    @Override
    public void display(){
        for(Packing laptop : laptopsList){
            System.out.print("Laptop name : " + laptop.laptopName());
            System.out.println(", Laptop price : " + laptop.price());
        }
    }
}