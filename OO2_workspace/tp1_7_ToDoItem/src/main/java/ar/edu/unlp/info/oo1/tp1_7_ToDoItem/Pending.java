package ar.edu.unlp.info.oo1.tp1_7_ToDoItem;

import java.time.Duration;

public class Pending extends ItemState{
	
	@Override
	public ItemState start(ToDoItem item) {
		item.setComienzo();
		return new InProgress();
	}
	
	@Override
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("No hay workedTime porque la tarea no está iniciada.");
	}
}
