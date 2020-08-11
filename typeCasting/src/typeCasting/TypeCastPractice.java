package typeCasting;

public class TypeCastPractice {
	
	public static void main(String args[]) {
		
		//Automatic conversion: byte-->short-->char-->int-->long-->float-->double 
		//boolean cannot be type casted
		
		
		
		int x = 56;
		float y = x;
		System.out.println("Int "+x+", Float"+y);      // Output: Int 56, Float56.0
		
		
		
		
		//during division
		int z = 55;
		y = x/z ; 				 //Gives wrong answer
		
		System.out.println(y);   // output: 1.0
		
		float f = 55.0f;
		y = x/f; 				 //Gives correct answer
		System.out.println(y);   // output: 1.0181818
		
		
		
		char c = (char)65;
		System.out.println("65 to char => "+c);  // output: 65 to char => A
		
		//Narrowing or Implicit conversion
		
		double myDouble = 2.8654;
		
		int myInt = (int)myDouble;  // Floor is considered
		System.out.println("Double "+myDouble+", Int "+myInt);  //output: Double 2.8654, Int 2
		
	}
	
}
