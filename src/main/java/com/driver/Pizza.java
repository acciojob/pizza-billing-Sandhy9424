package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    String []arr;
    boolean billg;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.arr=new String[4];
        if(isVeg){
            this.price=300;
            arr[0]="Base Price Of The Pizza: 300"+"\n";
        }
        else{
            this.price=400;
            arr[0]="Base Price Of The Pizza: 400\n";
        }
        this.bill="";
        billg=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(arr[1]==null) {
            this.price += 80;
            arr[1] = "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(arr[2]==null) {
                this.price += 70;
                arr[2] = "Extra Toppings Added: 70\n";
            }
            }
        else{
            if(arr[2]==null) {
                this.price += 120;
                arr[2] = "Extra Toppings Added: 120\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(arr[3]==null) {
            arr[3] = "Paperbag Added: 20\n";
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billg) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] != null) {
                    bill += arr[i];
                }
            }
            bill += "Total Price: " + this.price + "\n";
            billg=true;
        }
        return this.bill;
    }
}
