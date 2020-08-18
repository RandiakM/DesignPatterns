package com.Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointIcon, PointType> icons = new HashMap<>();

    public PointType getPointIcon(PointType type){
        //key->value
        //PointType -> PointIcon
        if(!icons.containsKey(type)){
            PointIcon icon = new PointIcon(type,null);
            //hospital.jpg
            //cafe.jpg
            icons.put(icon, type);
        }

        return icons.get(type);
    }
}
