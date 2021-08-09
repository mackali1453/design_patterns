package BuilderPattern;

public class Main {
    public static void main(String[] args)

{

    BuilderPattern lastikObject1 = new BuilderPattern.Builder()
    .withBrand("subaru")
    .withModel("levorg")
    .withYear(2015)
    .withbodyStyle("sedan")
    .withFuel("gasoline")
    .build();
    BuilderPattern lastikObject2 = new BuilderPattern.Builder()
    .withBrand("honda")
    .withModel("civic")
    .withFuel("gasoline")
    .build();
    
    System.out.printf(lastikObject1.getBrand()+"\n");
    System.out.printf(lastikObject2.getModel()+"\n");
}
}
