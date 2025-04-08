package queue1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class TaskQueue {
	protected PriorityQueue<Task> tasks;

	public TaskQueue() {
		tasks = new PriorityQueue<Task>(Comparator.comparingInt(Task::getPriorityLevel).reversed());
	}

	public void addTask() {
		Task task = new Task();
		task.acceptData();
		tasks.offer(task);
	}

	public void removeTask() {
		if (tasks.isEmpty()) {
			System.out.println("No task to process.");
			return;
		}
		Task task = tasks.poll();
		System.out.println("Processing task: [" + task.getTaskName() + "] (ID: [" + task.getTaskId() + "], Priority: ["
				+ task.getPriorityLevel() + "])");
	}

	public void showTask() {
		if (tasks.isEmpty()) {
			System.out.println("No task in the queue.");
			return;
		}
		Task task = tasks.peek();
		System.out.println("Next task: ["+task.getTaskName()+"] (ID: ["+task.getTaskId()+"], Priority: ["+task.getPriorityLevel()+"])");
	}
	
	public void displayPendingTask() {
		if (tasks.isEmpty()) {
			System.out.println("No pending tasks.");
			return;
		}
		for(Task t : tasks) {
			System.out.println("ID: "+t.getTaskId()+", Name: "+t.getTaskName()+", Priority: "+t.getPriorityLevel());
		}
	}
	
	public void countPendingTask() {
		System.out.println("Total Pending Tasks: "+tasks.size());
	}
}
