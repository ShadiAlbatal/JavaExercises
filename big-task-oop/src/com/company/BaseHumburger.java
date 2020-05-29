package com.company;

public class BaseHumburger {

    private final String name;
    private String meat;
    private final String bread;
    protected double finalPrice;
    private int baseePrice;

    private int majonesePrice = 1;
    private int lettucePrice = 3;
    private int tomatoPrice = 4;
    private int ciondimentPrice = 2;
    private int carrotPrice = 5;
    private int unionPrice = 6;



    public BaseHumburger(String name, String meat, String bread) {
        this.name = "MyRegularBurger";
        this.meat = "Beef";
        this.bread = "Bread roll";
        this.baseePrice= 40;
        //this.finalPrice

    }


    public int addunion(int union) {
        if(union < 0 && union > 4) {
            return -1;
        }
        return union;
    }

    public int addcarrot(int carrot) {
        if(carrot < 0 && carrot > 4) {
            return -1;
        }
        return carrot;
    }

    public int addLettuce(int Lettuce) {
        if(Lettuce < 0 && Lettuce > 4) {
            return -1;
        }
        return Lettuce;
    }

    public int addTomato(int tomato) {
        if(tomato < 0 && tomato > 4) {
            return -1;
        }
        return tomato;
    }

    private int addmajonese= 0;
    private int setmajonese (boolean majonese) {
        if(!majonese){
            return -1;
        }
        return addmajonese = majonesePrice;
    }

    private int addCiondiment= 0;
    private int setciodiment (boolean ciodiment) {
        if(!ciodiment){
            return -1;
        }
        return addmajonese = ciondimentPrice;
    }

    //menu show up
    public void menu(){
        System.out.println(
                "   BaseHumburgerPrice " + baseePrice +
                "   lettucePrice " + lettucePrice +
                "   tomatoPrice " + tomatoPrice
                        /* + "   majonesePrice " + majonesePrice +
                         "   ciondimentPrice " + ciondimentPrice */);


    }

    //make burger
    public void makeBurger(boolean ciondiment, boolean majonese, /* int union, int carrot,*/ int lettuce, int tomato){
            if(ciondiment == true && majonese== true && (addLettuce(lettuce) + addTomato(tomato) > 2)
                    || ciondiment == true && majonese== false && (addLettuce(lettuce) + addTomato(tomato) > 3)
                    || ciondiment == false && majonese== true && (addLettuce(lettuce) + addTomato(tomato) > 3)
                    || ciondiment == false && majonese== false && (addLettuce(lettuce) + addTomato(tomato) > 4)){


        // if(union + carrot + lettuce + tomato > 4){
            System.out.println("4 items allowed only");
        }
        else {
            if(majonese){
                setmajonese(majonese);
            }
            if(ciondiment){
                setciodiment(ciondiment);
            }
            //int getunion= addunion(union) * unionPrice;
            //int getcarrot= addcarrot(carrot) * carrotPrice;
            int getlettuce = addLettuce(lettuce) * lettucePrice;
            int gettomato = addTomato(tomato) * tomatoPrice;
            int getciondiment= ciondimentPrice;
            int getmajonese= majonesePrice;


                setFinalPrice(finalPrice= this.baseePrice + addmajonese + getlettuce + gettomato + addCiondiment);
                //setFinalPrice(finalPrice= this.baseePrice + getcarrot + getlettuce + gettomato + getunion);
            System.out.println("your final price: " + getFinalPrice());
        }
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public int getBaseePrice() {
        return baseePrice;
    }

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCarrotPrice() {
        return carrotPrice;
    }

    public int getUnionPrice() {
        return unionPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
