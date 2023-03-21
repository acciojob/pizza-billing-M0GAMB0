package com.driver;

public class Pizza {

     private int price;
    private Boolean isVeg;
    private Boolean isCheese;
    private Boolean isToppings;
    private Boolean isBag;
    private Boolean isBill;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg=isVeg;
        if(isVeg==true){
            price=300;
        }
        else{
            price=400;
        }
        isCheese=false;
        isToppings=false;
        isBag=false;
        isBill=false;
        bill="";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese)
        price+=80;
        isCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppings && isVeg)
        price+=70;
        else if(!isToppings && !isVeg)
        price+=120;
        isToppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBag)
        price+=20;
        isBag=true;
        
    }

    public String getBill(){
        if(!isBill)
        {
            if(isVeg){
            bill+=""+"Base Price Of The Pizza: 300";
        }
        else{
            bill+=""+"Base Price Of The Pizza: 400";
        }
        if(isCheese){
            bill+="\n"+"Extra Cheese Added: 80";
        }
        if(isToppings){
            if(isVeg)
            bill+="\n"+"Extra Toppings Added: 70";
            else if(!isVeg){
                bill+="\n"+"Extra Toppings Added: 120";
            }
        }
        if(isBag){
            bill+="\n"+"Paperbag Added: 20";
        }
        bill+="\n"+"Total Price: "+getPrice()+"\n";
        isBill=true;
        return this.bill;
        }
    }
}
