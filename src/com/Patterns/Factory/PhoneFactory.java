package com.Patterns.Factory;

public class PhoneFactory {
    public Phone getPhone(String shapeType){

        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Low Price")){
            return new HuaweiPhone();
        }
        if(shapeType.equalsIgnoreCase("Middle range Price")){
            return new SamsungPhone();
        }
        if(shapeType.equalsIgnoreCase("Expensive")){
            return new IPhone();
        }

        return null;
    }
}
