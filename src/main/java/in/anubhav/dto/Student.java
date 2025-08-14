package in.anubhav.dto;

public class Student {

	private String name;
	private String emailId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", emailId=" + emailId + "]";
	}
	
	
}
