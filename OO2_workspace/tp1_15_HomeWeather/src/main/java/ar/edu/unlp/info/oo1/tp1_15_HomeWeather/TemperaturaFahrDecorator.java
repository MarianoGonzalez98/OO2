package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

public class TemperaturaFahrDecorator extends Decorator{

    public TemperaturaFahrDecorator(HomeWeather base){
        super(base);
    }
    
    public String displayData(){
        return "Temperatura F: "+ Math.round(this.getTemperaturaFahrenheit()) + " " + super.displayData();
    }
}