package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

	String[] buildEmptyArray(int size) {
		String[] emptyArray = new String[size];
		return emptyArray; // null//
	}

	int[] buildArray(int a, int b, int c) {
		int[] Array = { a, b, c };
		return Array; // null;
	}

	boolean equality(int[] array1, int[] array2) {
		if (array1.length == array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true; /* if (array1.equals(array2)); return true; //return false;*/
	}

	String asString(int[] numbers) { /*transf numb en LinkedChain*/
		String string = "";
		for (int i = 0; i < numbers.length; i++){
			string += numbers[i] + ":";
			}

		return string;
	}

	String asStringJoin(int[] numbers) {
		
		String string= asString(numbers);
		string = string.substring(0, string.length()-1);
		
		return string;
	}

	String asString(String[] strings) {
		String string = "";
		for (int i = 0; i <strings.length; i++){
			string += strings[i] + " ";
			}
		
		return string.substring(0, string.length()-1);	
	}

	String asString(Card[] cards) {
		String string = "[";
		for (int i = 0; i < cards.length; i++){
			string += cards[i] + " ";
		}
		string = string.substring(0, string.length() - 1);
		string +="]";
		return string;
	}

}
