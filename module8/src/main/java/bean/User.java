package bean;

public class User {
	
	private String username;
	private String firstName;
	private String lastName;
	private int age;
	private String activity;
	private int goalWeight;
	public User(String username, String firstName, String lastName, int age, String activity, int goalWeight) {
		this.username=username;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.activity=activity;
		this.goalWeight=goalWeight;
	}
	public User() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getGoalWeight() {
		return goalWeight;
	}
	public void setGoalWeight(int goalWeight) {
		this.goalWeight = goalWeight;
	}
	
}