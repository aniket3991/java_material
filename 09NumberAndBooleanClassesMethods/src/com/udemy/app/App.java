package com.udemy.app;


public class App {
	
	/**		 
	 * 		Number & Boolean Classes Useful Methods
	 * 
	 **/

	public static void main(String[] args) {
		

	//comperTo()  
	//This method is used to compare the specified argument and the number object, but two different types cannot be compared.		 
		Integer I = 10;
		System.out.println("Test Integer.comperTo():" + I.compareTo(9));  //Integer is greater than the argument: 1
		System.out.println("Test Integer.comperTo():" + I.compareTo(10)); //Integer is equal to the argument: 0
		System.out.println("Test Integer.comperTo():" + I.compareTo(11));  //Integer is less than the argument: -1 
		
		Boolean B = true;
		Boolean B2 = false;
		Boolean B3 = true;
		System.out.println("Test Boolean.comperTo():"+ B.compareTo(B2)); //Boolean represents true and the argument represents false: 1
		System.out.println("Test Boolean.comperTo():"+ B.compareTo(B3)); //Boolean represents the same value as the argument: 0
		System.out.println("Test Boolean.comperTo():"+ B2.compareTo(B)); //Boolean represents false and the argument represents true: -1

	//equals()	
	//The method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
		Integer I2 = 10;
		Integer I3 = 9;
		System.out.println("Test Integer.equals():" + I.equals(I2)); 
		System.out.println("Test Integer.equals():" + I.equals(I3)); 
		
		System.out.println("Test Boolean.equals():" + B.equals(B3)); 
		System.out.println("Test Boolean.equals():" + B.equals(B2)); 
		
		//The difference between the == operator and the equals method will be discusses in the later (String) lectures
		
	//ceil() & floor()
		double d = 9.51;
		System.out.println("Test ceil():" + Math.ceil(d));
		System.out.println("Test floor():" + Math.floor(d));
		
	//round()
		double d2 = 20.59;
		System.out.println("Test round():" + Math.round(d2));
			
	//min() & max()   
		System.out.println("Test min():" + Math.min(d, d2));  
		System.out.println("Test max():" + Math.max(d, d2)); 
		
	//random()   This method returns a double between 0.0 and 1.0
		System.out.println("Test random():" +  Math.random() );
			
	//You can find other methods of Number & Boolean Classes in the Java API documentation. 

	}
}
