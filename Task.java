package taskSet;
import java.util.ArrayList;


public class Task 
{
	// Attributes - MainTask, SubTasks, Group, Tags (,files)
	private String MainTask;
	private ArrayList<String> SubTasks = new ArrayList<String>();
	private ArrayList<Member> Group = new ArrayList<Member>();
	private ArrayList<String> Tags = new ArrayList<String>();
	// private ArrayList<String> files = new ArrayList<String>();
	
	//constructor
	public Task() {
		setMainTask("There is no task to do yet.");
	} 
	public Task(String initialTask) {
		setMainTask(initialTask);
	} //MainTask
	
	//getter & setter
	public String getMainTask() {
		return MainTask;
	} //get
	public ArrayList<String> getSubTasks() {
		return SubTasks;	
	} //get
	public ArrayList<Member> getGroup() {
		return Group;
	} //get
	public ArrayList<String> getTags() {
		return Tags;
	} //get
	public void setMainTask(String mainTask) {
		MainTask = mainTask;
	} //set
	public void setSubTasks(ArrayList<String> subTasks) {
		SubTasks = subTasks;
	} //set
	public void setGroup(ArrayList<Member> group) {
		Group = group;
	} //set
	public void setTags(ArrayList<String> tags) {
		Tags = tags;
	} //set
	
	//add subtask, add tag
	public void addSubTask(String subtask) {
		SubTasks.add(subtask);
	}
	public void addTag(String tag) {
		Tags.add(tag);
	}
}

	
