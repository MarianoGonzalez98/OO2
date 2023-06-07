package ar.edu.unlp.info.oo1.tp1_15_HomeWeather;

public class PresionDecorator extends Decorator{

    public PresionDecorator(HomeWeather base){
        super(base);
    }

    public String displayData(){
        return "Presion atmosferifca:" + Math.round(this.getPresion()) + " " + super.displayData();
    }
}