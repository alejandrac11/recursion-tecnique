package Ejercicios;

public class NumArreglo {

	public static void main(String[] args) {
		
		int [] array= {10,20,45,80};
		
		
		System.out.println("El número mayor del arreglo, es: " + numMayor(array,0, 0));
	}
	
	public static int numMayor (int[] array, int posicion, int mayor) {
		if (posicion != array.length ) {
			
			if(array[posicion]<mayor) {
				
			mayor = numMayor(array, posicion+1, array[posicion] );	
		}
		
			else {
			
				mayor = numMayor (array, posicion+1, mayor);
		}
		}
		return mayor;
	}
}
