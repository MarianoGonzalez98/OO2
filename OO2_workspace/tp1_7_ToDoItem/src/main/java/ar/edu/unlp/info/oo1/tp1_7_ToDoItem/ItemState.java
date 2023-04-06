package ar.edu.unlp.info.oo1.tp1_7_ToDoItem;

import java.time.Duration;

public abstract class ItemState {
	
	public ItemState start(ToDoItem item) {
		return this;
	}
	
	public ItemState togglePause() {
		throw new RuntimeException("El toDoItem no se encuentra paused o inProgress");
	}

	public ItemState finish(ToDoItem item) {
		return this;
	}
	
	public void addComment(String comment, ToDoItem item) {
		item.comentar(comment);
	}
	
	public abstract Duration workedTime(ToDoItem item);
}

