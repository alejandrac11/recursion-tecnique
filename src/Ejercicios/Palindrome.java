package Ejercicios;

public class Palindrome {

	public static void main (String []args) {
		
		int array [] = {7,9,7};
		System.out.println("It´s Palindrome?? :" + numPalindrome(array,0,2));
	}
	
	public static boolean numPalindrome (int[]array, int posIn, int posFin) {
		if (posIn<posFin) {
			
			return true; 
		}
		else{
			if (array[posIn]==array[posFin]) {
				return numPalindrome(array, posIn+1, posFin-1);
			}
			return false;
		}
	}
	
	
	
}
