package com.fju.order;

public class FamilyDelivery extends Delivery{
    public FamilyDelivery(){
        name="Family";
        price=60;
    }
    public int amount(){
        return (int)(250);
    }
}
