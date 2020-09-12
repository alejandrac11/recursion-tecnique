package Ejercicios;

public class Digitos {

	public static void main (String[]args) {
		
		int num = 11;
		
		System.out.println("Number Digits:" + digitNum(num));
	}
	
	public static int  digitNum (int num) {
	
		if(num<10) {
			return 1;
		}
				return digitNum (num/10) +1;	
		}
	}

