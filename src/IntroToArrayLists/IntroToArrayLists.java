package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> mehList = new ArrayList<String>();
		mehList.add("Big");
		mehList.add("Boi");
		mehList.add("Brandon");
		mehList.add("Boughtened");
		mehList.add("Bhacon");
	//	for(String s : mehList ) {
	//		System.out.println(s);
	//	}
		for(int i = 4; i > mehList.size(); i--) {
			String s = mehList.get(i);
			System.out.println(s);
		}
		
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
