package com.company;

public class Healthy extends BaseHumburger{

    private final String bread;
    private int chessePrice=  3;
    private int mashromePrice= 2;

    public Healthy( String meat) {
        super("healty", meat, "brown");
        this.bread = "brow bread roll";
        this.chessePrice = 3;
        this.mashromePrice = 2;
    }

    public int addChesse(int chesse) {
        if(chesse < 0 && chesse > 4) {
            return -1;
        }
        return chesse;
    }

    public int addMashrome(int chesse) {
        if(chesse < 0 && chesse > 4) {
            return -1;
        }
        return chesse;
    }

    public int getChessePrice() {
        return chessePrice;
    }

    public int getMashromePrice() {
        return mashromePrice;
    }

    public void makeBurger(int union, int carrot, int lettuce, int tomato, int chesse, int mashrome) {
        if(addChesse(chesse) + addChesse(mashrome) + super.addcarrot(carrot) + super.addLettuce(lettuce) + super.addunion(union) + super.addTomato(mashrome)> 6){
            System.out.println("6 items allowed only");
        }
        else {
            int getunion= addunion(union) * getUnionPrice();
            int getcarrot= addcarrot(carrot) * getCarrotPrice();
            int getlettuce = addLettuce(lettuce) * getLettucePrice();
            int gettomato = addTomato(tomato) * getTomatoPrice();
            int getmashrome= addMashrome(mashrome) + getMashromePrice();
            int getchese= addChesse(chesse) + getChessePrice();

            super.finalPrice= super.getBaseePrice() + getcarrot + getlettuce + gettomato + getunion + getchese + getmashrome;
            System.out.println("your final price: " + getFinalPrice());
        }

    }
}
