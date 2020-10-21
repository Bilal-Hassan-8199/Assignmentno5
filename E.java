// Java program to use return keyword 

class E { 

 
	double AVG(double a, double b) 
	{ 
		double sum = 0; 
		sum = (a + b) / 2.0; 
		// return statement below: 
		return sum; 
	} 
	public static void main(String[] args) 
	{ 
		System.out.println(new E().AVG(5.5, 6.5)); 
	} 
} 
