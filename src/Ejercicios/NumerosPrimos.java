package Ejercicios;

public class NumerosPrimos {

	public static void main (String[]args) {
		
		int	num = 11;
		int div = 1;
		boolean prime = numPrimo(num, div+1);
		System.out.println("It´s prime?:" + prime );
	}

	public static boolean numPrimo (int num, int div) {
		 
		
	
		if (num/2 < div){
			
			return true;
		}
		else {
			if (num%div==0) {
				
				return false;
			}
			else {
				return numPrimo(num, div+1);
			}
		}
		}	
	
}
