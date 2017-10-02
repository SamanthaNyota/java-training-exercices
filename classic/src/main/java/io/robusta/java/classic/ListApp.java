package io.robusta.java.classic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ListApp {

	List<Integer> buildList(int a, int b, int c){
		
		List<Integer> List = new ArrayList<Integer> ();
    	List.add(a);
    	List.add(b);
    	List.add(c);

        return List;
    }


    ArrayList<Integer> buildList(int... numbers){
    	ArrayList<Integer> integers = new ArrayList<>();

    	for (int number : numbers){
    		 integers.add(number);
    	}
    		return integers;	
    }


    boolean equality(List<Integer> list1, List<Integer> list2){
    	
    	 if (list1.size() != list2.size()){
    	        return false;
    	    }
    	 
    	 int length= list1.size();
    	 
    	    for (int i = 0; i<length; i++){	
    	    	
    	    	if((!list1.get(i).equals(list2.get(i)))) {
    	        return false;
    	    }
    	    	
    	    }
        return true;
    }

    String asString (List<Integer> numbers){
    	
    	String string = "";
    	for (Integer number : numbers){
    		string += number + "";
    	}
    	
    	string = string.substring(0, string.length()-1);
    	
        return string;
    }


    int first(List<Integer> ints){
        return ints.get(0);
    }

    int last(List<Integer> ints){
        return ints.get(ints.size() -1);
    }

    int medium(List<Integer> ints){
        return ints.get((ints.size()-1)/2);
    }
}
