package io.robusta.animals.types;

import java.util.ArrayList;
import java.util.List;

public class IntegersApp {

	public static void main(String[] args) {
		IntegersApp app = new IntegersApp();
		app.launch();

	}
	
	public void launch(){
		int i = 3;
		int j = 4;
		int k = 5;
		
		Integer a = new Integer(3);	
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		// a.notify(); Integer is a real Object
		
		a=i; //tim
		Integer myInteger= 3;
		System.out.println(myInteger == i);
		
		Integer myOtherInterger = 3;
		System.out.println(myInteger == myOtherInterger);
		
		Integer x = new Integer(320);
		Integer y = new Integer(320);
		System.out.println(x.equals(y));
		
		
		x= 320;
		y= Integer.valueOf(320);
		System.out.println(x == y);
		
		
		x=10;
		y=12;
		System.out.println(x.equals(y));
		
		
		
		
	
		}
		
	}
