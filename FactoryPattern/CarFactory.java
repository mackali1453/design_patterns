package FactoryPattern;

public class CarFactory {
	
    public CarInterface getCarType(String carType){
       if(carType == null){
          return null;
       }		
       if(carType.equalsIgnoreCase("subaru")){
          return new subaru();
          
       } else if(carType.equalsIgnoreCase("honda")){
          return new honda();
          
       }
       
       return null;
    }
 }
