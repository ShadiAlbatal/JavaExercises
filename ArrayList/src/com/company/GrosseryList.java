package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class GrosseryList {

    private static ArrayList <String> myGrosseryList= new ArrayList<String>();

    public static void addGrosery(String item){
        myGrosseryList.add(item);
    }

    public static void printGroseryList(){
        System.out.println("grocery list have items " + myGrosseryList.size());
        for (int i= 0; i<myGrosseryList.size(); i++){
            System.out.println("item nr: "+ i + " is: "+ myGrosseryList.get(i) );
        }
    }

    public static void modifyGrosseryList(int position, String newItem){
        myGrosseryList.set(position, newItem);
        System.out.println("the new item in position nr: " + position + " is: " + myGrosseryList.get(position));
    }

    public static void modifyGrosseryList(String current, String newItem){
         int pos= myGrosseryList.indexOf(current);
        modifyGrosseryList(pos, newItem);
        System.out.println("the new item in position nr: " + pos + " is: " + myGrosseryList.get(pos));
    }


    public static void removeGroceryList(int position){
        System.out.println("the new item in position nr: " + position + " is going to be deleted: " + myGrosseryList.get(position));
        myGrosseryList.remove(position);
    }

    public static void removeGroceryList(String item){
        int pos= myGrosseryList.indexOf(item);
        removeGroceryList(pos);
        System.out.println("the new item in position nr: " + pos + " is going to be deleted: " + myGrosseryList.get(pos));

    }


    public static void finditem(String find){
        int pos= myGrosseryList.indexOf(find);
        if(pos>=0){
            System.out.println(find + "was founmd");
        }
    }

    public static int findPositionoffindItemGroceryList(String findItem){
        return myGrosseryList.indexOf(findItem);
    }
    public static void findItemGroceryList(String itemname){
    boolean exists= myGrosseryList.contains(itemname);
    if (!exists){
        System.out.println(itemname + "not exists");
    }else {
        System.out.println(itemname + "was found "+ findPositionoffindItemGroceryList(itemname));
    }
    }






}
