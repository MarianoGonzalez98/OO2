package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

import java.util.List;

public abstract class Decorator implements HomeWeather{
    private HomeWeather base;

    public Decorator(HomeWeather base){
        this.base = base;
    }
    public double getTemperaturaFahrenheit(){
        return this.base.getTemperaturaFahrenheit();
    }
    public double getPresion(){
        return this.base.getPresion();
    }
    public double getRadiacionSolar(){
        return this.base.getRadiacionSolar();
    }
    public List<Double> getTemperaturasFahrenheit(){
        return this.base.getTemperaturasFahrenheit();
    }
    public String displayData(){
        return this.base.displayData();
    }
}