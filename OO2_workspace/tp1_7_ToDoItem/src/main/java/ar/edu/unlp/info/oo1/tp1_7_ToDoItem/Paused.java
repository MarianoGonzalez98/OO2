package ar.edu.unlp.info.oo1.tp1_7_ToDoItem;

import java.time.Duration;

public class Paused extends ItemState{
	public ItemState togglePause() {
		return new InProgress();
	}
	
	public ItemState finish(ToDoItem item) {
		item.setFin();
		return new Finished();
	}
	
	public Duration workedTime(ToDoItem item) {
		return item.getDuracionHastaAhora();
	}
}
