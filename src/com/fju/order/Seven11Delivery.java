package com.fju.order;

public class Seven11Delivery extends Delivery {
    public Seven11Delivery() {
        name = "7-11";
        price = 60;
    }
    public int amount(){
        return (int)(700);
    }
}
