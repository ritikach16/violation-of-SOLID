class BuyDellLaptop implements BuyableLaptop{
    @Override
    public LaptopSpecification buyLaptop(){
        LaptopSpecification myDellLap = new LaptopSpecification();
            myDellLap.add(new Dell());
            return myDellLap;
    }
}

