package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

public class Main {

	public static void main(String[] args) {
		HomeWeatherStation station = new HomeWeatherStation(80, 5, 10);
		HomeWeather concreto = new HomeWeatherAdapter(station);
		
		System.out.println(concreto.getTemperaturaFahrenheit());

		HomeWeather decoratorPresion = new PresionDecorator(concreto);
		
		HomeWeather decoratorTemperaturaF = new TemperaturaFahrDecorator(decoratorPresion);
		
		System.out.println(decoratorTemperaturaF.displayData());
	}

}
