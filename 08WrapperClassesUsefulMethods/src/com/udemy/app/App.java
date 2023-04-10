package com.udemy.app;


public class App {
	
	/**		 
	 * 		Useful methods of the Wrapper Classes
	 *      (Number classes, Boolean Class, Character Class)
	 * 
	 **/

	public static void main(String[] args) {
		
		/**
		 * 	valueOf() method
		 * 		We can use this method to create Wrapper object for given primitive or String
		 */
		
	//valueOf(String s)   
		Integer IntObj = Integer.valueOf("20");
		Double DoubObj = Double.valueOf("20.0"); 
		Boolean BoolObj = Boolean.valueOf("false"); 
		//warning! if you give wrong value Java throws a RuntimeException (NumberFormatException)
		//Integer I2 = Integer.valueOf("twenty");
		System.out.println("Test valueOf(String s) method: "+ IntObj +", "+ DoubObj +", "+ BoolObj);
		
	//valueOf(String s, int radix)	
		Integer IR = Integer.valueOf("11010",2);  //in this example: binary system (The range of the radix is 2 to 36.)
		System.out.println("Test valueOf(String s, int radix) method: "+ IR);
		
	//valueOf(primitive p);
		Integer IP = Integer.valueOf(30); 
		Double DP = Double.valueOf(30.33); 
        Character CP = Character.valueOf('a'); 
        System.out.println("Test valueOf(primitive p) method: "+ IP +", "+ DP +", "+ CP);

		/**
		 * 	xxxValue() method
		 *		The method converts the value of the Number Object that invokes the method 
		 * 		to the primitive data type that is returned from the method.
		 */

        System.out.println("Test xxxValue() methods:"); 
        System.out.println(IntObj.byteValue()); 
        System.out.println(IntObj.shortValue()); 
        System.out.println(IntObj.intValue()); 
        System.out.println(IntObj.longValue()); 
        System.out.println(IntObj.floatValue()); 
        System.out.println(IntObj.doubleValue()); 
        
		/**
		 * 	parseXxx() method
		 *		We can use this method to convert String to primitive. 
		 */
        
    //parseXxx(String s)  
        int i = Integer.parseInt("40"); 
        double d = Double.parseDouble("40.44"); 
        boolean b = Boolean.parseBoolean("true"); 
        System.out.println("Test parseXxx(String s) method: "+ i +", "+ d +", "+ b);
        
    //parseXxx(String s, int radix) 
        //this method convert specified radix String to primitive
        int i2 = Integer.parseInt("11010", 2); 
        long l = Long.parseLong("1111", 2); 
        System.out.println("Test parseXxx(String s, int radix) method: "+ i2 + ", "+ l);
        
		/**
		 * 	toString() method
		 *		This method converts Wrapper object or primitive to String. 
		 */
        
     //toString()
        String s = IntObj.toString(); 
        System.out.println("Test toString() method: "+ s); 
        
     //toString(primitive p)
        String s2 = Integer.toString(150);  
        String s3 = Character.toString('b'); 
        System.out.println("Test toString(primitive p) method: "+ s2 + ", "+ s3); 
        
     //toString(primitive p, int radix);    
        String s4 = Long.toString(13,2); 
        System.out.println("Test toString(primitive p, int radix) method: "+ s4); 
        
	}
}
