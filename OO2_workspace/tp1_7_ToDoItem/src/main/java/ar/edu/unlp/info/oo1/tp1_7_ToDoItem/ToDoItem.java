package ar.edu.unlp.info.oo1.tp1_7_ToDoItem;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private ItemState state;
	private List<String> comentarios;
	private LocalTime timeComienzo;
	private LocalTime timeFin;
	
	
	public ToDoItem(String name) {
		comentarios = new ArrayList<>();
		state = new Pending();
		this.name = name;
	}
	

	public void start() {
		state = state.start(this);
	}

	public void togglePause() {
		state = state.togglePause();
	}

	public void finish(){
		state = state.finish(this);
	}
	
	public Duration workedTime() {
		return state.workedTime(this);
	}
	
	
	public void addComment(String comment) {
		state.addComment(comment, this);
	}
	
	public void comentar(String comment) {
		this.comentarios.add(comment);
	}
	
	public void setComienzo() {
		this.timeComienzo = LocalTime.now();
	}
	
	public void setFin() {
		this.timeFin = LocalTime.now();
	}

	
	public Duration getDuracionHastaAhora() {
		return Duration.between(timeComienzo,LocalTime.now());
	}
	
	public Duration getDuracionTotal() {
		return Duration.between(timeComienzo,timeFin);
	}
	
	
	//para tests:
	
	public ItemState getState() {
		return this.state;
	}
	
    public boolean contieneComentario(String comment) {
   	 return (comentarios.contains(comment));
    }
}
