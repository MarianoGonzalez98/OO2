package test;

import java.util.Iterator;

public class testMain {
	double x;
	static double varGlobal1; //se inicializa automáticamente en 0.0
	static StringBuilder varGlobal2;	//se inicializa automáticamente en null
	static int variable = 1; //se inicializa automáticamente en 0
	public static void main(String[] args) {
		varGlobal2 = new StringBuilder("asd"); //la variable ahora contiene la direccion de memoria de la heap
		double varLocal1; //no se inicializa con ningún valor
		int j = 3;
		double variable = 4.0;
		varLocal1 = 2;
		varGlobal1 = 1.0;
		System.out.println("variables: "+ varGlobal1 +" "+ varGlobal2 +" "+variable +" "+j);
		int i;
		//for ( ; ; ) {		}
	}
	
}

//