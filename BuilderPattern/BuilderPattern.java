package BuilderPattern;
public class BuilderPattern {
    private String brand;
    private String model;
    private float year;
    private String bodyStyle;
    private String fuel;
    private BuilderPattern(Builder builder)
    {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.bodyStyle = builder.bodyStyle;
        this.fuel = builder.fuel;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }
    
    public float getYear()
    {
        return this.year;
    }
    public String getBodyStyle()
    {
        return this.bodyStyle;
    }
    public String getFuel()
    {
        return this.fuel;
    }
    public static class Builder {

        private String brand;
        private String model;
        private float year;
        private String bodyStyle;
        private String fuel;
        


        public Builder() {
        
        }

        public Builder withBrand(String brand){
            this.brand = brand;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder withModel(String model){
            this.model = model;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder withYear(float year){
            this.year = year;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder withbodyStyle(String bodyStyle){
            this.bodyStyle = bodyStyle;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder withFuel(String fuel){
            this.fuel = fuel;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
        
        
    }

    

}
