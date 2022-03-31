public class AccessSpecifier {
    public static void main(String[] args) {
        sample sm = new sample();
        int su = sm.myfun(1, 2);
        int mu = sm.mul(3,4);  
        System.out.println(su+" "+mu);
    }
}

class sample {
    private int sum;
    private int a;
    private int b;

    private int fun() {
        sum = a + b;
        return sum;
    }
    protected int mul(int a, int b){
        return a*b;
    }
    public int myfun(int a, int b) {
        this.a = a;
        this.b = b;
        return fun();
    }
}
