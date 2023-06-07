package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

import java.util.List;

public class HomeWeatherStation{
    private double temperaturaFahrenheit;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturasFahrenheit;

    public HomeWeatherStation(double tempFar, double presion,double radiacionSolar){
        this.temperaturaFahrenheit=tempFar;
        this.presion=presion;
        this.radiacionSolar=radiacionSolar;
    }

    public double getTemperaturaFahrenheit(){
        return this.temperaturaFahrenheit;
    }
    public double getPresion(){
        return this.presion;
    }
    public double getRadiacionSolar(){
        return this.radiacionSolar;
    }
    public List<Double> getTemperaturasFahrenheit(){
        return this.temperaturasFahrenheit;
    }

    public void addTemperaturaFarhenheit(double temp){
        this.temperaturasFahrenheit.add(temp);
    }

}