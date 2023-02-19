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
        this.arr=new String[4];
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
        if(arr[1]==null){
            Sum+=80;
        }
       arr[1]="Extra Cheese Added: 80\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(arr[2]==null) {
                Sum += 70;
                arr[2] = "Extra Toppings Added: 70\n";
            }
            }
        else{
            if(arr[2]==null) {
                Sum += 120;
                arr[2] = "Extra Toppings Added: 120\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(arr[3]==null) {
            arr[3] = "Paperbag Added: 20\n";
            Sum += 20;
        }
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
