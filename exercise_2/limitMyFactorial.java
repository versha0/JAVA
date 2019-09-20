import java.util.*;
import java.lang.Integer;
import java.lang.*;
public class limitMyFactorial{
	public static void main(String[] args){
	
		intFactorial();
		longFactorial();
		

	}
	  static void intFactorial(){
		int i=1;
		int fact=1;
		int extreme= Integer.MAX_VALUE;

		while(i>0){
			System.out.println("The Factorial of" + i+ "is " + fact);
			if(extreme/fact<(i+1)){
				break;
			}
			i++;
			fact=fact*i;
		}
	}
		static void longFactorial(){
			long i=1;
			long fact=1;
			long extreme= Long.MAX_VALUE;
	
			while(i>0){
				System.out.println("The Factorial of" + i+ "is " + fact);
				if(extreme/fact<(i+1)){
					break;
				}
				i++;
				fact=fact*i;
			}
	    
	
	}
}