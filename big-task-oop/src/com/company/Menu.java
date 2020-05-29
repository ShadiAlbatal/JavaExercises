package com.company;

public class Menu {

    private int majonesePrice;
    private int lettucePrice;
    private int tomatoPrice;
    private int ciondimentPrice;

    public Menu() {
        this.majonesePrice = 3;
        this.lettucePrice = 4;
        this.tomatoPrice = 5;
        this.ciondimentPrice = 2;
    }

    public int getMajonesePrice() {
        return majonesePrice;
    }

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCiondimentPrice() {
        return ciondimentPrice;
    }
}
