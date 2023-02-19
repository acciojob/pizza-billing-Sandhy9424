package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    String []arr;
    int Sum;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        arr=new String[4];
        if(isVeg){
            price=300;
            arr[0]="Base Price Of The Pizza: 300"+"\n";
            Sum=300;
        }
        else{
            price=400;
            arr[0]="Base Price Of The Pizza: 400\n";
            Sum=400;
        }
        this.bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       arr[1]="Extra Cheese Added: 80\n";
       Sum+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            arr[2]="Extra Toppings For Veg Pizza = 70\n";
            Sum+=70;
        }
        else{
            arr[2]="Extra Toppings For Non-veg Pizza = 120\n";
            Sum+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        arr[3]="Paperbag Added: 20\n";
        Sum+=20;
    }

    public String getBill(){
        // your code goes here
        for(int i=0;i<4;i++){
            if(arr[i]!=null) {
                bill += arr[i];
            }
        }
        bill+="Total Price: "+Sum+"\n";
        return this.bill;
    }
}
