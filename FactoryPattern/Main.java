package FactoryPattern;

public class Main {
    public static void main(String[] args)

{
    CarFactory carFactory = new CarFactory();
    CarInterface car1 = carFactory.getCarType("subaru");
    CarInterface car2 = carFactory.getCarType("honda");
    System.out.println(car1.getBrand());
    System.out.println(car2.getBrand());
}
}
