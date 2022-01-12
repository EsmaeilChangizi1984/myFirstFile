package dataTypes;

public class hello {
	
	public static void main(String[] args) {
		System.out.println("Hello Esmaeil");
		//syso + control + space
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		long mylong = 100L;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		//CASTING in Java
		byte myMinValue = Byte.MIN_VALUE;
		byte myVal = (byte)(myMinValue/2);
		System.out.println(myVal);
		
		//float and double
		int myInt = 5;
		float myFloat = 3.5f;
		double myDouble = 6d;
		double num = 4;
		float number = (float)5.6;
		
		//char and boolean
		char myChar = 'e';
		boolean myBoolean = true;
		System.out.println(myBoolean);
		
		
		//String data type
		String myString = "Esmaeil";
		
		//Ternary operator
		double val = 20;
		double secval = 80;
		double result = val + secval*100;
		double newresult = result%40;
		
		System.out.println("Remainder is equal : " + newresult);
		 boolean check = (newresult == 0)?true:false;//Ternary operator
		 if(check) {
			 System.out.println("Remainder is Zero");
		 }
			 else  {
				 System.out.println("got some remainder");
			 }
		 

	}
}
