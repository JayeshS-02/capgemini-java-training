package queue1;

import java.util.Objects;
import java.util.*;

public class Task {
	protected int taskId;
	protected String taskName;
	protected int priorityLevel;
	public Task() {
		super();
	}
	public Task(int taskId, String taskName, int priorityLevel) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.priorityLevel = priorityLevel;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(priorityLevel, taskId, taskName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return priorityLevel == other.priorityLevel && taskId == other.taskId
				&& Objects.equals(taskName, other.taskName);
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter task ID");
		taskId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter task Name");
		taskName=sc.nextLine();
		System.out.println("Enter task Priority Level");
		priorityLevel=sc.nextInt();
	}
}
