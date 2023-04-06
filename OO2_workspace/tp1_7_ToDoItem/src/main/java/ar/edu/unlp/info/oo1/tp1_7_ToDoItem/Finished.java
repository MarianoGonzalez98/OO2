package ar.edu.unlp.info.oo1.tp1_7_ToDoItem;

import java.time.Duration;

public class Finished extends ItemState{

	
	@Override
	public void addComment(String comment, ToDoItem item) {
		//no hace nada
	}
	
	@Override
	public Duration workedTime(ToDoItem item) {
		return item.getDuracionTotal();
	}
	
	
}
