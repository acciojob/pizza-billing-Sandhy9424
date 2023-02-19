package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        arr[1]="Extra Cheese Added: 80\n";
        Sum+=80;
        if(isVeg) {
            arr[2] = "Extra Toppings Added: 70\n";
            Sum+=70;
        }
        else{
            arr[2] = "Extra Toppings Added: 120\n";
            Sum+=120;
        }
    }
}
