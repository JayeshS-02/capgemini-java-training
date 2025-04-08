package queue1;
import java.util.*;
public class TaskRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskQueue taskAccess = new TaskQueue();
		while(true) {
			System.out.println("\n1. Add a Task\n"
					+ "2. Process a Task (Dequeue)\n"
					+ "3. Peek at the Next Task\n"
					+ "4. Display All Pending Tasks\n"
					+ "5. Count Total Pending Tasks\n"
					+ "6. Exit the Program\n");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				taskAccess.addTask();
				break;
				
			case 2:
				taskAccess.removeTask();
				break;
			
			case 3:
				taskAccess.showTask();
				break;
				
			case 4:
				taskAccess.displayPendingTask();
				break;
				
			case 5:
				taskAccess.countPendingTask();
				break;
				
			case 6:
				System.out.println("Exiting the Factory Task Scheduling System. Goodbye!");
				System.exit(0);
			}
		}
	}
}
