package Entities;
public class Instructor extends Human{
	private String Detail;

	public Instructor(int id, String name, String lastName, String detail) {
		super(id, name, lastName);
		Detail = detail;
	}

	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}
}
