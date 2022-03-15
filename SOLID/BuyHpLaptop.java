class BuyHpLaptop implements BuyableLaptop{
    @Override
    public LaptopSpecification buyLaptop(){
        LaptopSpecification myHpLap = new LaptopSpecification();
        myHpLap.add(new Hp());
        return myHpLap;
    }
}