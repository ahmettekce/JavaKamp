package Entities;

public class Human implements IEntiti {
	private int Id;
	private String Name;
	private String LastName;
	public Human(int id, String name, String lastName) {
		super();
		Id = id;
		Name = name;
		LastName = lastName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
