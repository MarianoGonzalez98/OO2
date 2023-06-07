package test;


public class Main {

	/*
	
	Dado un número natural indique si es un número primo o no.
	Ejemplo:
	35 -> return false
	89 -> return true
	
	*/
	
	public static boolean esPrimo(int num) {
		if (num<=1) {
			return false;
		}
		
		int i = 2;
		boolean modDio0 = false;
		
		while ((i<num)&&(!modDio0)) {
			if (num % i == 0) {
				modDio0 = true;
			}
			i++;
		}
		
		return !modDio0;
		
	}
	
	public static void descomponerEnPrimos(int num) {
		System.out.println(num + " = " );
		
		if (num<=1) {
			return;
		}
		
		boolean condicion = true;
		int result = num;
		
		while (result != 1) {
			for (int i = 2; i <= result; i++) {
				if (esPrimo(i) && (result % i == 0)) {
					result = result / i;
					System.out.println(" "+ i);
					break;
				}
			}
		}
	}
	
	/*
	 Dado un número natural descomponerlo en números primos en una cadena de caracteres.
	Ejemplo:
		20 = “2*2*5”
		36 = “2*2*3*3”
		45 = “3*3*5”
	 */
	
	public static void main(String[] args) {

	//System.out.println(esPrimo(0));
		descomponerEnPrimos(23);
	}

}
