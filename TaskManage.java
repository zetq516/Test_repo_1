package taskSet;
import java.util.ArrayList;

public class TaskManage 
{
	//TaskManage - Tasks
	private ArrayList<Task> Tasks = new ArrayList<Task>();

	//get & set
	public ArrayList<Task> getTasks() {
		return Tasks;
	} //get
	public void setTasks(ArrayList<Task> tasks) {
		Tasks = tasks;
	} //set
	
	//Methods for Management
	public void addTask(Task task) {
		Tasks.add(task);
	} //Register new MainTask to Tasks
	public void addSubTask(Task task, String subtask) {
		for(Task ts : Tasks)
			if(ts.equals(task)) ts.addSubTask(subtask);
	} //Register new SubTask to selected MainTask
	public void assignTask(String name, String subtask) {
		for(Task ts:Tasks) 
			for(Member mem:ts.getGroup())
				if(mem.getName().equals(name)) mem.assignTask(subtask);
	} //assign Task to Member
	
	public void showAssignedMember(Task task, String subtask) {
		ArrayList<String> assignedMember = new ArrayList<String>();
		for(Member mem:task.getGroup()) 
			for(String subts:mem.getTaskList())
				if(subtask.equals(subts)) assignedMember.add(mem.getName());
		System.out.print("[");
		for(String name:assignedMember) System.out.print(name +", ");
		System.out.print("]");
	}
	public void showTasks() {
		System.out.println("========[Entire Task List]=======================================");
		for(Task ts:Tasks) {
			System.out.println(ts.getMainTask());
			for(String subts:ts.getSubTasks()) {
				System.out.print(subts + " - ");
				showAssignedMember(ts, subts);
				System.out.println();
			}
		}
		System.out.println("=================================================================");
	}
	
	//upload(share) files
	
}



