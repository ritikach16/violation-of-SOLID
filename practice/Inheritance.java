public class Inheritance extends Bicycle{
    public static void main(String[] args) {
        
    } 
}

class Bicycle{
    int wheels;
    int speed;
    int gear;
    public void specification(int wheels, int speed, int gear){
        this.wheels = wheels;
        this.gear = gear;
        this.speed = speed;
    }
}
