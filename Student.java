package kamp3day;

public class Student extends User{
String userName;
String number;
String password;

public String getFirstName() {
	return userName;
	
}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber (String number) {
		this.number=number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword (String password) {
		this.password=password;
	}
}
