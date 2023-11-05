package assignment1;

import java.util.ArrayList;
import java.util.Collections;

//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

public class ClassA {
	
	//execution starts from here
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//looping
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.println("The shuffeled array: " + list);
        
        //output: The shuffeled array: [1, 2, 4, 6, 5, 3, 7]
	}

}
