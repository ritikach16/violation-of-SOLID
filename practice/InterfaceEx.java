public class InterfaceEx implements In1 {
    public void display(){
        System.out.println("interface");
    }
    public static void main(String[] args) {
        InterfaceEx eg = new InterfaceEx();
        eg.display();
    }
}

interface In1{
    final int a = 20;
    int b = 20;
    void display();
    // void show();
}

abstract class Mobile{
    int m = 10;
   abstract void myfun();
   abstract int sum(int a, int b);
}

// class MobApple extends Mobile{

// }
