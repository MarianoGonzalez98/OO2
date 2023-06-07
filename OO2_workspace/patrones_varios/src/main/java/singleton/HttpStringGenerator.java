package singleton;

public class HttpStringGenerator {
	private static HttpStringGenerator instancia;
	private StringBuilder stringBuilder;
	
	private HttpStringGenerator() {
		this.stringBuilder = new StringBuilder();
	};
	
	public static HttpStringGenerator returnInstance() {
		if (instancia==null) {
			instancia = new HttpStringGenerator();
		}
		return instancia;
	}
	
	
	
	
	
	
	
	
	public StringBuilder buildString(String string) {
		stringBuilder.setLength(0);
		return stringBuilder.append(string);
	}
	public StringBuilder buildString2(String string) {
		return new StringBuilder(string);
	}
}
