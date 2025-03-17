package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List groceryList = new ArrayList();

    Scanner myScanner = new Scanner(System.in);

    public void startGrocery(int userInput){
        userInput = myScanner.nextInt();

    }
    public static void addItems(String input){
        if(input.contains(",")){
            String[] xs = input.split(",");
            for(String x:xs){
                if(!groceryList.contains(x)){
                    groceryList.add(x);
                }
            }
        }else {
            if(!groceryList.contains(input))
            groceryList.add(input);
        }

        Collections.sort(groceryList);
    }

    public static void removeItems(String input){
        if(input.contains(",")){
            String[] xs = input.split(",");
            for(String x:xs){
                groceryList.remove(groceryList.indexOf(x));
            }
        }else{
            groceryList.remove(groceryList.indexOf(input));
        }

        Collections.sort(groceryList);
    }
    public static boolean checkItemIsInlist(String product){
        return groceryList.contains(product);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }


}
