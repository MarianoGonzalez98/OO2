package singleton;

public class Main {

	public static void main(String[] args) {
		HttpStringGenerator stringGenerator = HttpStringGenerator.returnInstance();
		
		System.out.println(stringGenerator.buildString("HOLA"));
		System.out.println(stringGenerator);
		
		stringGenerator = HttpStringGenerator.returnInstance();
		
		System.out.println(stringGenerator.buildString("Como estas"));
		System.out.println(stringGenerator);
	}

}
