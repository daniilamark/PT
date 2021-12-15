package com.daniilamark.university.lab_8;

import java.util.ArrayList;

public interface Interface {
    default ArrayList classesToList(Palm palm, Flower flower){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(palm);
        arrayList.add(flower);
        return arrayList;
    }
}

