package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

import java.util.List;

public class HomeWeatherAdapter implements HomeWeather{
    private HomeWeatherStation homeWeatherStation;

    public HomeWeatherAdapter(HomeWeatherStation hw){
        this.homeWeatherStation = hw;
    }

    public double getTemperaturaFahrenheit(){
        return this.homeWeatherStation.getTemperaturaFahrenheit();
    }

    public double getPresion(){
        return this.homeWeatherStation.getPresion();
    }

    public double getRadiacionSolar(){
        return this.homeWeatherStation.getRadiacionSolar();
    }

    public List<Double> getTemperaturasFahrenheit(){
        return this.homeWeatherStation.getTemperaturasFahrenheit();
    }

    public double getTemperaturaCelsius(){
        return (this.getTemperaturaFahrenheit() - 32)/1.8;
    }

    public double getPromedioHistoricoFahrenheit(){
        List<Double> listaTemperaturas =  this.getTemperaturasFahrenheit();
        double suma = listaTemperaturas.stream().mapToDouble( t -> t).sum();
        return suma / listaTemperaturas.size();
    }

    public String displayData(){
        return "";
    }
}