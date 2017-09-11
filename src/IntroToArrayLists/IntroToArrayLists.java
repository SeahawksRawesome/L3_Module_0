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
		// Reverse loop. Only prints words with an 'e'
		for(int i =  mehList.size() -1; i >= 0; i--) {
			String s = mehList.get(i);
			if(s.contains("e")) {
				System.out.println(s);	
			}
			
			
		}
		
		
	}
}
