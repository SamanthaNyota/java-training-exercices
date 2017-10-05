package io.robusta.java.classic.pingouins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {


    Penguin createSimplePenguin(){

        Penguin johan = new Penguin ("Johan");

        return johan;
    }




    List<Penguin> getPenguins(Penguin p1, Penguin p2, Penguin p3, Penguin p4, Penguin p5){

        List<Penguin> penguins = new ArrayList<>();
        penguins.addAll(Arrays.asList(p1, p2, p3, p4, p5));
    	
        return penguins;
    }

    Penguin getPenguinByName(Penguin[] pingouins, String name){
    	
    	
        return null;
    }


    Penguin getFastest(List<Penguin> penguins){
    	
    	
        return null;
    }

    Penguin getFriend(Penguin penguin){
        return null;
    }

    List<Penguin> getPenguinsWithLetter(    Penguin[] pengouins, String letters){
        return null;
    }

    Penguin[] getPenguinsWithLetter(    List<Penguin> pengouins, String letters){
        return null;
    }


    Object getSmallestSize(Penguin[] array, List<Penguin> list){
        return null;
    }





    List<Penguin> getFriends(Penguin[] penguins){
        return null;
    }




}

//liste size
//tableau length
