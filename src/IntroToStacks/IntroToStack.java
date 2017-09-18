package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> pushPop = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand = new Random();
		for(int i = 0; i < 100; i++) {
			double x = rand.nextDouble();
			x = x * 100;
		//	System.out.println(x);
			pushPop.push(x);
		
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String y = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String z = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		Double v = Double.parseDouble(y);
		Double q = Double.parseDouble(z);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for(int i = 0; i < pushPop.size(); i=i) {
			Double b =  pushPop.pop();
			if(b > v && b < q) {
				System.out.println(b);
			//	System.out.println("" + v + "\n" + q);
				
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
