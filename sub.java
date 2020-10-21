// Program use methodsin java 
import java.io.*; 

class sub { 
	
	int sub = 0; 
	
	public int subTwoInt(int a, int b){ 
		
		// Subtracting two integer value. 
		sub = a-b; 
		
		//returning subtraction of two values. 
		return sub; 
	} 
	
} 

class bilal { 
	public static void main (String[] args) { 
	
		// creating an instance of substraction class 
		sub add = new sub(); 
		
		// calling addTwoInt() method to add two integer using instance created 
		// in above step. 
		int s = sub.subTwoInt(2,1); 
		System.out.println("Sub of two integer values :"- s); 
		
	} 
} 
