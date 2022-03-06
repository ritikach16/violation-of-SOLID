public class ClassAndObjects {
    public static void main(String[] args) {
        Car mycar =  new Car();
        mycar.spec(true, 30, "red");
    }
}

class Car{
    int mpg;
    boolean containsAirbags;
    String color;
    public void spec(boolean containsAirbags, int mpg, String color){
        this.containsAirbags = containsAirbags;
        this.mpg = mpg;
        this.color = color;
        System.out.println("Car specifications are : " + containsAirbags + " , " + mpg + " , " + color);
    }
}
