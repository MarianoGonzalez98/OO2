package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

import java.util.List;

public interface HomeWeather{
    public double getTemperaturaFahrenheit();
    public double getPresion();
    public double getRadiacionSolar();
    public List<Double> getTemperaturasFahrenheit();
    public String displayData();
}

