package io.robusta.java.classic;

/**
 * Created by nicorama on 22/06/2017.
 */
public class FoodApp {


    static final int TRAVEL_COST = 2;

    int money = 0;
    int foodStock = 1000;



    void reset(){
    	
    	money = 0; //argent de la boite
    	foodStock = 1000;//stock de nourriture
    	
 
    }

    int deliver(int food){
    	int gross = 2*food; 
    	foodStock -= food; // foodstock = foodstock - food
    	money = money + gross - TRAVEL_COST;
   
        return gross;
    }

    int deliverAll(int count, int food){
    	
    	int value = 0; //value peut être renommée gross
    	for (int i = 0; i<count; i++){
    		value += deliver(food); //value = value +deliver(food)
    	}

        return value;
    }


}



//fonction qui renvoie combien j'ai gagné