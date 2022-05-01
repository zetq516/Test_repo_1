package taskSet;
import java.util.ArrayList;

public class Member 
{
	/* generalize "User" class later */
	private String name;
	private ArrayList<String> TaskList = new ArrayList<String>();

	//constructor
	public Member() {
		name = "NoName";
	}
	public Member(String memberName) {
		this.name = memberName;
	} //name
	
	//getter & setter
	public String getName() {
		return name;
	} //get
	public ArrayList<String> getTaskList() {
		return TaskList;
	} //get
	public void setName(String name) {
		this.name = name;
	} //set
	public void setTaskList(ArrayList<String> taskList) {
		TaskList = taskList;
	} //set
	
	//assignTask
	public void assignTask(String task) {
		TaskList.add(task);
	}
}
