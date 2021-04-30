package kamp3day;

public class User {
String userName;
String nationalIdentity;
String password;
String school;

public String getuserName() {
	return userName;
}
public void setuserName(String userName) {
	this.userName = userName;
	
}
	public String getnationalIdentity() {
		return nationalIdentity;
	}
	public void setnationalIdentity(String nationalIdentity) {
		this.nationalIdentity=nationalIdentity;
	}
	public String getpassword() {
		return password;	
	}
	public void setpassword(String password) {
		this.password=password;	
	}
	public String getschool() {
		return school;
	}
	public void setschool(String school) {
		this.school=school;
	}
	
}
